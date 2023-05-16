/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author CamiloH
 */
public class Baraja {

    private final ArrayList<Carta> cartas;
    private ArrayList<Carta> monton;

    //Constructor baraja
    public Baraja() {
        cartas = new ArrayList();
        monton = new ArrayList();
        String[] nameCard = {"oros", "copas", "espadas", "bastos"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        for (String name : nameCard) {
            for (int n : numbers) {
                cartas.add(new Carta(n, name));

            }
        }

    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    //m�todo barajar 
    public void barajar() {
        Collections.shuffle(cartas);

    }

    /*
        siguienteCarta(): devuelve la siguiente carta que est� en la baraja, 
        cuando no haya m�s o se haya llegado al final, se indica al usuario 
        que no hay m�s cartas.
     */
    //m�todo siguiente carta
    public Carta siguienteCarta() {

        if (cartas.isEmpty()) {
            System.out.println("Su arrayList esta vacio ");
            return null;
        }
        Carta carta = cartas.remove(0);
        monton.add(carta);
        return carta;
    }

    /*
        cartasDisponibles(): indica el n�mero de cartas que a�n 
        se puede repartir.
     */
    public void cartasDisponibles() {
        System.out.println("Quedan por repartir: " + cartas.size() + " cartas");
    }

    /*
        darCartas(): dado un n�mero de cartas que nos pidan, le devolveremos 
    ese n�mero de cartas. En caso de que haya menos cartas que las pedidas, 
    no devolveremos nada, pero debemos indic�rselo al usuario.
     */
    public void darCartas(int ncartas) {
        for (int i = 0; i < ncartas; i++) {

            System.out.println(siguienteCarta());
        }

    }

    /*
        cartasMonton(): mostramos aquellas cartas que ya han salido, 
        si no ha salido ninguna indic�rselo al usuario
     */
    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("Todavia no hay ninguna carta "
                    + "en el mont�n");

        } else {
            for (Carta carta : monton) {
                System.out.println("" + carta);
                
            }
        }
    }
    
    /*
        mostrarBaraja(): muestra todas las cartas hasta el final. 
        Es decir, si se saca una carta y
        luego se llama al m�todo, este no mostrara esa primera carta.
    */
    public void mostrarBaraja(){
        for (Carta carta : cartas) {
            System.out.println("" + carta);
        }
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Baraja{");
        sb.append("\n cartas=").append(cartas);
        sb.append('}');
        return sb.toString();
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

    public String toString2() {
        StringBuilder sb = new StringBuilder();
        sb.append("Baraja{");
        sb.append("\n cartas=").append(monton);
        sb.append('}');
        return sb.toString();
    }

}
