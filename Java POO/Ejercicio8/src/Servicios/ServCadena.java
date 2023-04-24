/*
 * 
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServCadena {

    Scanner leer = new Scanner(System.in);

    public Cadena crearFrase() {
        Cadena texto = new Cadena();
        System.out.println("Ingrese una frase o cadena de texto ");
        texto.setFrase(leer.next());

        return texto;
    }

    /*
        a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
          frase ingresada.
     */
    public void mostrarVocales(Cadena contar) {

        int vocales = 0;
        for (int x = 0; x < contar.getFrase().length(); x++) {
            char letraActual = contar.getFrase().charAt(x);
            if (esVocal(letraActual)) {
                vocales++;
            } else {

            }
        }
        System.out.println("Vocales en la palabra " + contar.getFrase() + " número de vocales  " + vocales);

    }

    private static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }

    /*
        b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public String invertirFrase(Cadena inv) {
        String invertido = inv.getFrase();

        StringBuilder read = new StringBuilder(invertido); //modifica una cadena sin crear un objeto
        read.reverse();
        System.out.println("La frase invertida es: " + read.toString());

        return invertido;
    }

    /*
        c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
        contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
        d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    public char vecesRepetido(Cadena letra) {

        System.out.println("Ingrese un caracter, para verificar cuantas veces se repite: ");
        char text = leer.next().charAt(0);
        int caracteres = 0;
        for (int x = 0; x < letra.getFrase().length(); x++) {
            char letraActual = letra.getFrase().charAt(x);
            if (text == letraActual) {
                caracteres++;
            } else {

            }
        }
        System.out.println("El caracter " + text + " se repite " + caracteres + " veces ");

        return text;

    }

    /*
         e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
        compone la clase con otra nueva frase ingresada por el usuario.
     */
    public String compararLongitud(Cadena cadena) {
        System.out.println("Ingrese una segunda frase ");
        String texto = leer.next();
        String t = cadena.getFrase();

        if (t.length() == texto.length()) {
            System.out.println("Tienen la misma cantidad de caracteres la palabra " + texto + " y la palabra " + cadena.getFrase());
        } else if (t.length() < texto.length()) {
            System.out.println("Tiene menor cantidad de caracteres la palabra " + cadena.getFrase() + " que la palabra " + texto);

        } else {
            System.out.println("La frase " + cadena.getFrase() + " tiene mayor cantidad de caracteres que la palabra " + texto);
        }

        return texto;
    }

    /*
        f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
        con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public String unirFrases(Cadena unir) {
        System.out.println("Ingrese una segunda frase para unirla con la palabra inicialmente ingresada ");
        String texto = leer.next();
        System.out.println(" La frase unida es:  " + texto.concat(" " + unir.getFrase()));

        return texto;
    }

    /*
        g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
        encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
        la frase resultante.
     */
    public String reemplazar(Cadena letra) {
        System.out.println("Ingrese un caracter para reemplazar la letra a: ");
        String c = leer.next();

        String b = letra.getFrase().replaceAll("a", c);
        System.out.println("La nueva palabra es: " + b);

        return b;

    }

    /*
        h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public boolean contiene(Cadena contener) {
        System.out.println("Ingrese una letra para comprobar, si se encuentra dentro de la cadena ");
        String letra = leer.next();
        boolean rpta = false;
        if (contener.getFrase().contains(letra)) {
            System.out.println(" " + rpta );
           return rpta = true;
        }else{
            System.out.println(" " + rpta );
            return rpta = false;
            
        }
                
    }

}
