import models.Amarre;
import models.Muelle;
import models.Reserva;
import models.Velero;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("BIENVENIDOS AL MUELLE FER CHIQUITO");

        System.out.println("ingrese sus datos");

        Reserva reserva = new Reserva();

        System.out.println("Igrese su nombre");

        reserva.setNombreUsuario(scan.next());
        System.out.println("Ingrese su dni");

        reserva.setDni(scan.nextInt());

        System.out.println("Ingrese la fecha de inicio del alquiler");

        System.out.println("Dia: DD");
        int dia = scan.nextInt();
        System.out.println("Mes: MM");
        int mes = scan.nextInt();
        System.out.println("Año: AAAA");
        int anio = scan.nextInt();
        LocalDate fechaAlquiler = LocalDate.of(anio, mes, dia);
        reserva.setFecheAlquiler(fechaAlquiler);

        System.out.println("Ingrese la fecha de devolucion del alquiler");
        System.out.println("Dia: DD");
        int dia2 = scan.nextInt();
        System.out.println("Mes: MM");
        int mes2 = scan.nextInt();
        System.out.println("Año: AAAA");
        int anio2 = scan.nextInt();
        LocalDate fechaDevolucion = LocalDate.of(anio2, mes2, dia2);
        reserva.setFechaDevolucion(fechaDevolucion);

        System.out.println("Ingrese datos del barco:");
        System.out.println("Ingrese su matricula");

        String matricula = scan.next();
        System.out.println("Ingrese la eslora");

        double eslora = scan.nextDouble();
        System.out.println("Ingrese el año de fabricacion");

        int anioFabricacion = scan.nextInt();
        System.out.println("Ingrese el numero de mastiles");

        int mastiles = scan.nextInt();
        Velero velero = new Velero(matricula, eslora, anioFabricacion, mastiles);

        reserva.setBarcoUsuario(velero);
        Amarre amarre = new Amarre(1, true);
        reserva.setPosicionAmarre(amarre);
        velero.modulo();
        System.out.println("estos son los datos");
        System.out.println(reserva);
        System.out.println("este es el valor del alquiler");
        reserva.calculoAlquiler();
        System.out.println("este es la posicion de su amarre");



    }
}