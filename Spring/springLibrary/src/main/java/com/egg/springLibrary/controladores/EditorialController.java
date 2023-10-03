/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.egg.springLibrary.controladores;

import com.egg.springLibrary.entidades.Editorial;
import com.egg.springLibrary.excepciones.MyException;
import com.egg.springLibrary.servicios.EditorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author CamiloH
 */
@Controller
@RequestMapping("/editorial")
public class EditorialController {

    @Autowired
    private EditorialService editorialServicio;

    @GetMapping("/registrar")
    public String editorial() {
        return "editorial_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo) {
        try {
            //System.out.println("Nombre: " + nombre);
            editorialServicio.createEditorial(nombre);
            modelo.put("exito", "La editorial fue guardada en la Base de Datos");

        } catch (MyException ex) {
            modelo.put("error", ex.getMessage());
            return "editorial_form.html";
        }
        return "index.html";

    }

    
    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Editorial> editoriales = editorialServicio.listAllEditorials();
        modelo.addAttribute("editoriales", editoriales);
        return "editorial_list.html";
    }
    
    //Traer el id señalado a modificar
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo){
        modelo.put("editorial", editorialServicio.getOne(id));
        return "editorial_modificar.html";
    
    }
    
    //Realizar la modificación al id previamente seleccionado 
    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String nombre, ModelMap modelo ){
        try {
            editorialServicio.updateOnlyOneEditorial(id, nombre);
            modelo.put("exito", "Se ha modificado el nombre de la Editorial");
            return "redirect:../lista";
        } catch (MyException ex) {
            modelo.put("error", "No se ha realizado ningún cambio");
            return "editorial_modificar.html";
        }
        
    }

}
