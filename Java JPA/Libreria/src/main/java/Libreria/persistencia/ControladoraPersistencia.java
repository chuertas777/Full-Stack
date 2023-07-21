/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.persistencia;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.entidades.Libro;
import Libreria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author CamiloH
 */
public class ControladoraPersistencia {

    LibroJpaController libroJpa = new LibroJpaController();
    AutorJpaController autorJpa = new AutorJpaController();
    EditorialJpaController editorialJpa = new EditorialJpaController();
    PrestamoJpaController prestamoJpa = new PrestamoJpaController();
    ClienteJpaController clienteJpa = new ClienteJpaController();

    //-----------------------------------------------------------------------
    //Métodos para la entidad libro 
    public void crearLibro(Libro libro) {
        libroJpa.create(libro);
    }

    public List<Libro> consultarLibros() {
        return libroJpa.findLibroEntities();
    }

    public void editarLibro(long isbn, String titulo) throws Exception {
        libroJpa.editLibroByIsbn(isbn, titulo);
    }

    public void eliminarLibro(long isbn) throws NonexistentEntityException {
        libroJpa.destroy(isbn);
    }

    public Libro consultarISBNLibro(Long bn) {
        return libroJpa.findLibro(bn);
    }

    public List<Libro> consultarNombreLibro(String titulo) {
        return libroJpa.findLibroName(titulo);
    }

    public List<Libro> consultarLibroAutor(String nombreAutor) {
        return libroJpa.findLibroNameAutor(nombreAutor);
    }

    public List<Libro> consultarLibroEditorial(String nombreEditorial) {
        return libroJpa.findLibroNameEditorial(nombreEditorial);
    }

    //-----------------------------------------------------------------------
    //Métodos para la entidad Autor
    public void crearAutor(Autor autor) throws Exception {
        autorJpa.create(autor);
    }

    public List<Autor> consultarNombreAutor(String nombre) {
        return autorJpa.findAutorName(nombre);
    }

    public Autor consultarIDAutor(int id) {
        return autorJpa.findAutor(id);
    }

    public List<Autor> consultaListaAutores() {
        return autorJpa.findAutorEntities();
    }

    public void editarAutor(int id, String nombre) throws Exception {
        autorJpa.editAutorById(id, nombre);
    }

    public void eliminarAutor(int id) throws NonexistentEntityException {
        autorJpa.destroy(id);
    }

    //-----------------------------------------------------------------------
    //Métodos para la entidad Editorial
    public void crearEditorial(Editorial editorial) throws Exception {
        editorialJpa.create(editorial);
    }

}
