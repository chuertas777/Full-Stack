package models;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private String nombreUsuario;
    private int dni;
    private LocalDate fecheAlquiler;
    private LocalDate fechaDevolucion;
    private Amarre posicionAmarre;
    private Barco barcoUsuario;

    public Reserva() {
    }

    public Reserva(String nombreUsuario, int dni, LocalDate fecheAlquiler, LocalDate fechaDevolucion, Amarre posicionAmarre, Barco barcoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.dni = dni;
        this.fecheAlquiler = fecheAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barcoUsuario = barcoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecheAlquiler() {
        return fecheAlquiler;
    }

    public void setFecheAlquiler(LocalDate fecheAlquiler) {
        this.fecheAlquiler = fecheAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Amarre getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Amarre posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarcoUsuario() {
        return barcoUsuario;
    }

    public void setBarcoUsuario(Barco barcoUsuario) {
        this.barcoUsuario = barcoUsuario;
    }
    public void calculoAlquiler(){
        int alquiler = (int) ChronoUnit.DAYS.between(fecheAlquiler, fechaDevolucion);
        System.out.println("El coste del aquiler es:" + alquiler * barcoUsuario.modulo());
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", dni=" + dni +
                ", fecheAlquiler=" + fecheAlquiler +
                ", fechaDevolucion=" + fechaDevolucion +
                ", posicionAmarre=" + posicionAmarre +
                ", barcoUsuario=" + barcoUsuario +
                '}';
    }
}
