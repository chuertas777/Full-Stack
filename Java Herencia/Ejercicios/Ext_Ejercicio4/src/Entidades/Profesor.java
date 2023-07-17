/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Arrays;

/**
 *
 * @author CamiloH
 */
public class Profesor extends SistemaGestionFacultad {

    private String[] departamento = {"lenguaje", "matematicas", "literatura", "computacion",
        "programacion"};
    private String deptoProfesor;

    public Profesor() {
    }

    public Profesor(String deptoProfesor, String nombre, String apellido, int dni, String estadoCivil, int yearIngreso, int ndespacho) {
        super(nombre, apellido, dni, estadoCivil, yearIngreso, ndespacho);
        this.deptoProfesor = deptoProfesor;
    }

    public String[] getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String[] departamento) {
        this.departamento = departamento;
    }

    public String getDeptoProfesor() {
        return deptoProfesor;
    }

    public void setDeptoProfesor(String deptoProfesor) {
        this.deptoProfesor = deptoProfesor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sistema de gestión Facultad ");
        sb.append("\n Profesor: ");
        sb.append("\n Departamento Profesor: ").append(deptoProfesor);
        sb.append(super.toString());
        return sb.toString();
    }
    
    

    @Override
    public void cambioDepartamento() {
        System.out.println("Elija el departamento al que pertenece");
        
        System.out.println(Arrays.toString(departamento));
        deptoProfesor = leer.next();
    }
    
    
    
    

}
