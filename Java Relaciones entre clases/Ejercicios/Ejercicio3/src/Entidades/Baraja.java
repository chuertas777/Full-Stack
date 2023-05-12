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
    
    //método barajar 
    public void barajar(){
        Collections.shuffle(cartas);
    
    }
    
    public void darCartas(int ncartas){
        monton = new ArrayList(); 
    }
    
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Baraja{");
        sb.append("\n cartas=").append(cartas);
        sb.append('}');
        return sb.toString();
    }

    
    
    

   
    
    

}
