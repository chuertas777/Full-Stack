/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.egg.springLibrary.controladores;

import com.egg.springLibrary.entidades.Usuario;
import com.egg.springLibrary.excepciones.MyException;
import com.egg.springLibrary.servicios.UserService;
import java.util.List;
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
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UserService usuarioServicio;

    @GetMapping("/dashboard")
    public String panelAdministrativo() {

        return "panel.html";
    }

    @GetMapping("/usuarios")
    public String listar(ModelMap modelo) {
        List<Usuario> usuarios = usuarioServicio.listarUsuarios();
        modelo.addAttribute("usuarios", usuarios);

        return "usuario_list";
    }

    @GetMapping("/modificarRol/{id}")
    public String cambiarRol(@PathVariable String id) {
        usuarioServicio.cambiarRol(id);

        return "redirect:/admin/usuarios";
    }

    @GetMapping("/modificar/{id}")
    public String modificarUsuario(@PathVariable String id) {
       

        return "redirect:/perfil";
    }
    
    
    //Ingresar al perfil de usuario
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/perfil")
    public String perfil(ModelMap modelo, HttpSession session) {
        Usuario usuario = (Usuario) session.getAttribute("usuariosesion");
        if (usuario.getRol().toString().equals("ADMIN")) {
            modelo.put("usuario", usuario);
            return "admin_modificar";
        }
        
        return "panel.html";
        
    }
    
    
   //Editar o actualizar el perfil admin 
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @PostMapping("/perfil/{id}")
    public String actualizar(MultipartFile archivo, @PathVariable String id,
            @RequestParam String nombre, @RequestParam String email,
            @RequestParam String password, @RequestParam String password2, ModelMap modelo) {

        try {
            usuarioServicio.actualizar(archivo,
                    id, nombre, email, password, password2);
            modelo.put("exito", "Usuario actualizado correctamente!");
            return "panel.html";

        } catch (MyException ex) {
            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);

        }

        return "admin_modificar.html";
    }
    
    
    
    
    
   
}
