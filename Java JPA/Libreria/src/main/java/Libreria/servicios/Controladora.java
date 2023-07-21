/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.entidades.Libro;
import Libreria.persistencia.ControladoraPersistencia;
import Libreria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author CamiloH
 */
public class Controladora {

    ControladoraPersistencia cp = new ControladoraPersistencia();

    //Métodos hacia la persistencia entidad Libro
    public void crearLibro(Libro libro) {
        cp.crearLibro(libro);
    }

    public List<Libro> consultarLibros() {
        return cp.consultarLibros();
    }

    public void editarLibro(long isbn, String titulo) throws Exception {
        cp.editarLibro(isbn, titulo);
    }

    public void eliminarLibro(long isbn) throws NonexistentEntityException{
        cp.eliminarLibro(isbn);
    }

    public Libro consultarISBNLibro(Long isbn) {
        return cp.consultarISBNLibro(isbn);
    }

    public List<Libro> consultarNombreLibro(String titulo) {
        return cp.consultarNombreLibro(titulo);
    }

    public List<Libro> consultarLibroAutor(String nombreAutor) {
        return cp.consultarLibroAutor(nombreAutor);
    }

    public List<Libro> consultarLibroEditorial(String nombreEditorial) {
        return cp.consultarLibroEditorial(nombreEditorial);
    }

    //Métodos hacia la persistencia entidad Autor
    public void crearAutor(Autor autor) throws Exception {
        cp.crearAutor(autor);
    }

    public Autor consultarIDAutor(int id) {
        return cp.consultarIDAutor(id);
    }

    public List<Autor> consultarNombreAutor(String nombre) {
        return cp.consultarNombreAutor(nombre);
    }

    public List<Autor> consultaListaAutores() {
        return cp.consultaListaAutores();
    }

    public void editarAutor(int id, String nombre) throws Exception {
        cp.editarAutor(id, nombre);
    }

    //Método hacia la persistencia entidad Autor eliminar Autor por ID 
    public void eliminarAutor(int id) throws NonexistentEntityException {
        cp.eliminarAutor(id);
    }

    //Métodos hacia la persistencia entidad Editorial
    public void crearEditorial(Editorial editorial) throws Exception {
        cp.crearEditorial(editorial);
    }

    public List<Autor> consultarAutores() {
        return cp.consultaListaAutores();
    }

}
