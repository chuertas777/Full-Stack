/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.egg.springLibrary.controladores;

import com.egg.springLibrary.entidades.Usuario;
import com.egg.springLibrary.servicios.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
       

        return "redirect:/admin/usuarios";
    }
    
    
   
}
