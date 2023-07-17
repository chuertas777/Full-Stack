/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Estudiante extends SistemaGestionFacultad {

    private String cursoMatriculado;

    public Estudiante() {
    }

    public Estudiante(String cursoMatriculado, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sistema de gestión Facultad ");
        sb.append("\n Curso Matriculado ").append(cursoMatriculado);
        sb.append(super.toString());
        return sb.toString(); 
    }

   

        
    @Override
    public void matriculaEstudiante() {
        
        System.out.println("Ingrese el curso al cual desea matricularse");
        cursoMatriculado = leer.next();
    }

    
}
