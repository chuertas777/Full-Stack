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
public class PersonalServicio extends SistemaGestionFacultad {

    private String[] seccion = {"biblioteca", "laboratorio", "decanato", "secretaria",
        "coliseo"};

    private String seccionPersonal;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccionPersonal, String nombre,
            String apellido, int dni, String estadoCivil, int yearIngreso, int ndespacho) {
        super(nombre, apellido, dni, estadoCivil, yearIngreso, ndespacho);
        this.seccionPersonal = seccionPersonal;
    }

    public String[] getSeccion() {
        return seccion;
    }

    public void setSeccion(String[] seccion) {
        this.seccion = seccion;
    }

    public String getSeccionPersonal() {
        return seccionPersonal;
    }

    public void setSeccionPersonal(String seccionPersonal) {
        this.seccionPersonal = seccionPersonal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sistema de gestión facultad ");
        sb.append("\n Personal Servicio: ");
        sb.append("\n Seccion Personal: ").append(seccionPersonal);
        sb.append(super.toString());
        return sb.toString();
    }

    @Override
    public void trasladoSeccion() {
        System.out.println("Defina la seccion a la cual a sido trasladado ");
        System.out.println(Arrays.toString(seccion));
        seccionPersonal = leer.next();
    }

}
