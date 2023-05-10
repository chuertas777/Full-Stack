package model;

import java.util.ArrayList;

/**
 *
 * @author QuinSDev
 */
public class Equipo {
    
    private ArrayList<Jugador>  equipo;

    public Equipo() {
       equipo = new ArrayList<>();
    }

    public Equipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }

    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(Jugador equipo) {
        this.equipo.add(equipo);
    }
    
    
}
