/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class SistemaGestionFacultad {

    protected String nombre;
    protected String apellido;
    protected int dni;
    protected String estadoCivil;
    protected int yearIngreso;
    protected int ndespacho;

    Scanner leer = new Scanner(System.in);

    public SistemaGestionFacultad() {
    }

    public SistemaGestionFacultad(String nombre, String apellido, int dni, String estadoCivil, int yearIngreso, int ndespacho) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
        this.yearIngreso = yearIngreso;
        this.ndespacho = ndespacho;
    }

    public SistemaGestionFacultad(String nombre, String apellido, int dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getYearIngreso() {
        return yearIngreso;
    }

    public void setYearIngreso(int yearIngreso) {
        this.yearIngreso = yearIngreso;
    }

    public int getNdespacho() {
        return ndespacho;
    }

    public void setNdespacho(int ndespacho) {
        this.ndespacho = ndespacho;
    }

    public void cambioEstadoCivil() {

        System.out.println("Ingrese su nuevo estado civil");
        estadoCivil = leer.next();

    }

    public void reasignacionDespacho() {
        System.out.println("Designe el despacho asignado");
        ndespacho = leer.nextInt();

    }

    public void matriculaEstudiante() {
        
    }

    public void cambioDepartamento() {
        
    }

    public void trasladoSeccion() {
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       
        sb.append("\n Nombre: ").append(nombre);
        sb.append("\n Apellido: ").append(apellido);
        sb.append("\n Dni: ").append(dni);
        sb.append("\n Estado Civil: ").append(estadoCivil);
        sb.append("\n Año Ingreso: ").append(yearIngreso);
        sb.append("\n Número Despacho: ").append(ndespacho);
        return sb.toString();
    }
    
    

}
