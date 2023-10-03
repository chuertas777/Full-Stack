package com.egg.springLibrary.controladores;

import com.egg.springLibrary.entidades.Author;
import com.egg.springLibrary.excepciones.MyException;
import com.egg.springLibrary.servicios.AuthorService;
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
@RequestMapping("/autor")
public class AuthorController {

    @Autowired
    private AuthorService autorServicio;

    @GetMapping("/registrar")
    public String author() {
        return "author_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo) {
        try {
            //System.out.println("Nombre: " + nombre);
            autorServicio.createAuthor(nombre);
            modelo.put("exito", "El Autor fue guardado en la Base de Datos");

        } catch (MyException ex) {
            modelo.put("error", ex.getMessage());
            return "author_form.html";
        }
        return "index.html";

    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Author> autores = autorServicio.listAllAuthors();
        modelo.addAttribute("autores", autores);
        return "autor_list.html";
    }

    //Traer el id señalado a modificar
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo) {
        modelo.put("autor", autorServicio.getOne(id));
        return "autor_modificar.html";
    }

    //Realizar la modificación al id previamente seleccionado 
    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String nombre, ModelMap modelo) {
        try {
            autorServicio.modificarAutor(id, nombre);
            modelo.put("exito", "Se ha modificado el nombre del Autor");
            return "redirect:../lista";
        } catch (MyException ex) {
            modelo.put("error", "No se ha realizado ningún cambio");
            return "autor_modificar.html";
        }

    }

}
