package equipodefutbol;

import model.Equipo;
import model.Jugador;

/**
 *
 * @author QuinSDev
 */
public class EquipoDeFutbol {

    public static void main(String[] args) {
        
        Equipo equipo = new Equipo();
        
        equipo.setEquipo(new Jugador("Lionel", "Messi", "Delantero",10));
        equipo.setEquipo(new Jugador("Sergio", "Aguero", "Delantero",9));
        equipo.setEquipo(new Jugador("Juan", "Cuadrado", "Lateral derecho",11));
        
        for (Jugador jugador : equipo.getEquipo()) {
            System.out.println(jugador.toString());
        }
    }
    
}
