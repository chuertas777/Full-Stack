/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.egg.springLibrary.controladores;

import com.egg.springLibrary.entidades.Author;
import com.egg.springLibrary.entidades.Book;
import com.egg.springLibrary.entidades.Editorial;
import com.egg.springLibrary.excepciones.MyException;
import com.egg.springLibrary.servicios.AuthorService;
import com.egg.springLibrary.servicios.BookService;
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
@RequestMapping("/libro")
public class BookController {

    @Autowired
    private BookService libroServicio;

    @Autowired
    private AuthorService autorServicio;

    @Autowired
    private EditorialService editorialServicio;

    @GetMapping("/registrar")
    public String libro(ModelMap modelo) {
        List<Author> autores = autorServicio.listAllAuthors();
        List<Editorial> editoriales = editorialServicio.listAllEditorials();

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);

        return "libro_form.html";
    }

    //Registrar libros 
    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long isbn,
            @RequestParam String titulo,
            @RequestParam(required = false) Integer copias,
            @RequestParam String idautor,
            @RequestParam String ideditorial, ModelMap modelo) {
        try {
            //System.out.println("Nombre: " + nombre);
            libroServicio.createBook(
                    isbn,
                    titulo,
                    copias,
                    idautor,
                    ideditorial);
            modelo.put("exito", "El libro fue guardado en la Base de Datos");
        } catch (MyException ex) {
            List<Author> autores = autorServicio.listAllAuthors();
            List<Editorial> editoriales = editorialServicio.listAllEditorials();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);
            modelo.put("error", ex.getMessage());
            return "libro_form.html";
        }
        return "index.html";

    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Book> libros = libroServicio.listAllBooks();
        modelo.addAttribute("libros", libros);
        return "libro_list.html";
    }

    //Traer el id señalado a eliminar
    @GetMapping("/eliminar/{isbn}")
    public String eliminar(@PathVariable Long isbn, ModelMap modelo) {
        modelo.put("libro", libroServicio.getOne(isbn));
        return "libro_eliminar.html";
    }

    //Realizar la eliminacion del isbn previamente seleccionado 
    @PostMapping("/eliminar/{isbn}")
    public String eliminado(@PathVariable Long isbn, ModelMap modelo) {
        try {
            libroServicio.eliminarLibro(isbn);
            modelo.put("exito", "Se ha eliminado el libro seleccionado");
            return "redirect:../lista";
        } catch (MyException ex) {
            modelo.put("error", "No se ha realizado ningún cambio");
            return "libro_eliminar.html";
        }

    }

    //Traer el id señalado a modificar
    @GetMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, ModelMap modelo) {
        modelo.put("libro", libroServicio.getOne(isbn));
        
        List<Author> autores = autorServicio.listAllAuthors();
        List<Editorial> editoriales = editorialServicio.listAllEditorials();
        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);
        
        return "libro_modificar.html";
    }

    //Realizar la modificación al id previamente seleccionado 
    @PostMapping("/modificar/{isbn}")
    public String modificarLibro(@RequestParam Long isbn, @RequestParam String title,
           @RequestParam String idautor, @RequestParam String ideditorial,
            @RequestParam Integer copies, ModelMap modelo) {
        try {
            libroServicio.updateOnlyOneBook(
                    isbn,
                    title,
                    idautor,
                    ideditorial,
                    copies);

            modelo.put("exito", "Se ha modificado el libro correctamente");
            return "redirect:../lista";
        } catch (MyException ex) {

             modelo.put("error", ex.getMessage());
            return "libro_modificar.html";
        }

    }

}
