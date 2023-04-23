/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import Entidades.Libro;
import Servicios.ServLibro;

/**
 *
 * @author CamiloH
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo un objeto de la clase ServLibro
        ServLibro serv = new ServLibro();

        //Instanciamos un objeto de tipo Libro y le asignamos el metodo crearlibro()
        Libro libro = serv.crearLibro();
        
        //Instanciamos de la clase servicio el método servicio
        serv.mostrarLibros(libro);

    }

}
