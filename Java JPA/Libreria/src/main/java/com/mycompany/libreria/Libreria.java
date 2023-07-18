/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libreria;

import Libreria.persistencia.ControladoraPersistencia;
import Libreria.servicios.MenuLibreria;

/**
 *
 * @author CamiloH
 */
public class Libreria {

    public static void main(String[] args) throws Exception {
        
        ControladoraPersistencia cp = new ControladoraPersistencia();
        
        MenuLibreria menu = new MenuLibreria();
        menu.menuPrincipal();
        
    }
}
