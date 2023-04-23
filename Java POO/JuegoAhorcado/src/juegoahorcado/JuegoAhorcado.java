/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoahorcado;

import java.util.Scanner;
/**
 *
 * @author Ingenieria
 */
public class JuegoAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Palabras disponibles para el juego
        String[] palabras = {"computadora", "programacion", "java", "ahorcado", "variable"};

        // Seleccionar una palabra al azar
        String palabraSeleccionada = seleccionarPalabra(palabras);

        // Crear un arreglo de caracteres para la palabra seleccionada
        char[] palabraOculta = crearArregloPalabra(palabraSeleccionada);

        // Inicializar variables para llevar registro del estado del juego
        int intentosRestantes = 6;
        boolean juegoTerminado = false;

        // Loop principal del juego
        while (!juegoTerminado) {
            // Mostrar la palabra oculta y el número de intentos restantes
            System.out.println("Palabra oculta: " + String.valueOf(palabraOculta));
            System.out.println("Intentos restantes: " + intentosRestantes);

            // Pedir al jugador que ingrese una letra
            System.out.print("Ingresa una letra: ");
            Scanner scanner = new Scanner(System.in);
            char letra = scanner.next().charAt(0);

            // Verificar si la letra ingresada está en la palabra seleccionada
            boolean letraEncontrada = false;
            for (int i = 0; i < palabraSeleccionada.length(); i++) {
                if (palabraSeleccionada.charAt(i) == letra) {
                    // Actualizar la palabra oculta con la letra encontrada
                    palabraOculta[i] = letra;
                    letraEncontrada = true;
                }
            }

            // Si la letra no fue encontrada, decrementar los intentos restantes
            if (!letraEncontrada) {
                intentosRestantes--;
            }

            // Verificar si el jugador ha perdido
            if (intentosRestantes == 0) {
                System.out.println("¡Perdiste! La palabra era: " + palabraSeleccionada);
                juegoTerminado = true;
            }

            // Verificar si el jugador ha ganado
            if (String.valueOf(palabraOculta).equals(palabraSeleccionada)) {
                System.out.println("¡Ganaste!");
                juegoTerminado = true;
            }
        }
    }

    // Método para seleccionar una palabra al azar de un arreglo
    public static String seleccionarPalabra(String[] palabras) {
        int indice = (int) (Math.random() * palabras.length);
        return palabras[indice];
    }

    // Método para crear un arreglo de caracteres para una palabra
    public static char[] crearArregloPalabra(String palabra) {
        char[] arreglo = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            arreglo[i] = '_';
        }
        return arreglo;
    }
    
}
