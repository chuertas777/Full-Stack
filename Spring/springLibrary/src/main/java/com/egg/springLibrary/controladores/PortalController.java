/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.springLibrary.controladores;

import com.egg.springLibrary.entidades.Usuario;
import com.egg.springLibrary.excepciones.MyException;
import com.egg.springLibrary.servicios.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author CamiloH
 */
@Controller
@RequestMapping("/")
public class PortalController {

    @Autowired
    private UserService usuarioServicio;

    //Devolver vista index
    @GetMapping("/")
    public String index() {
        return "index.html"; //devolver la vista
    }

    //Ruta registrar usuario
    @GetMapping("/registrar")
    public String registrar() {
        return "registro.html"; //devolver la vista
    }

    //Verificación comprobación de los datos recibidos en el formulario registro
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre,
            @RequestParam String email, @RequestParam String password, @
            RequestParam String password2, ModelMap modelo, MultipartFile archivo) {
        try {
            usuarioServicio.createUser(archivo, nombre, email, password, password2);
            modelo.put("exito", "Se ha registrado el usuario correctamente");
            return "index.html";
        } catch (MyException ex) {
            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);
            modelo.put("password", password);
            modelo.put("password2", password2);
            modelo.put("archivo", archivo);
            return "registro.html";
        }

    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, HttpSession session, 
            ModelMap modelo) {

        if (error != null) {
            modelo.put("error", "Usuario o contraseña invalidos");
            session.removeAttribute("usuariosesion");
        }
        return "login.html"; //devolver la vista
    }

    //Ingresar al perfil admin de usuario
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String inicio(HttpSession sesion) {
        Usuario logueado = (Usuario) sesion.getAttribute("usuariosesion");

        if (logueado.getRol().toString().equals("ADMIN")) {
            return "redirect:/admin/dashboard";
        }

        return "inicio.html";
    }

    //Ingresar al perfil de usuario
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/perfil")
    public String perfil(ModelMap modelo, HttpSession session) {
        Usuario usuario = (Usuario) session.getAttribute("usuariosesion");
        modelo.put("usuario", usuario);
        return "usuario_modificar.html";
    }

    //Editar o actualizar el perfil usuario 
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @PostMapping("/perfil/{id}")
    public String actualizar(MultipartFile archivo, @PathVariable String id,
            @RequestParam String nombre, @RequestParam String email,
            @RequestParam String password, @RequestParam String password2, ModelMap modelo) {

        try {
            usuarioServicio.actualizar(archivo,
                    id, nombre, email, password, password2);
            modelo.put("exito", "Usuario actualizado correctamente!");
            return "inicio.html";

        } catch (MyException ex) {
            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);

        }

        return "usuario_modificar.html";
    }

}
