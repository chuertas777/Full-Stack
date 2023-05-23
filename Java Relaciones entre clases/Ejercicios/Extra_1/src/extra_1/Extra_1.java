/*
 *  Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
    tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
    cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
    al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
    persona.
    Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
    personas con sus respectivos perros.
 */
package extra_1;

import Servicios.ServPerrera;

/**
 *
 * @author CamiloH
 */
public class Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServPerrera srv = new ServPerrera();
        srv.adopcionPerros();
        

       

        /*

        1
        System.out.println("------------------------------------------------");
        System.out.println("¿Ingrese el nombre del perro que desea adoptar?");
        
        boolean adoptarP = false;
        
        for (Perro perro : perros) {
            String nperro = leer.next().toUpperCase();
            if (nperro.equalsIgnoreCase(nperro)) {
                System.out.println("El perro no esta disponible, elige otro");
                adoptarP = true;
                break;
            }
            
        }
        
        if (!adoptarP) {
            boolean disponible = false;
            for (Perro perro : perros) {
                String nomP = leer.next().toUpperCase();
                if (nomP.equalsIgnoreCase(nomP)) {
                    adoptados.add(perro);
                    int indexP = adoptados.indexOf(perro);
                    
                }
            }
        }
        
        
        System.out.println("Ingrese su nombre ");
        String name = leer.next().toLowerCase();
        for (Persona persona : personas) {
            if (persona.getNombre().equals(name)) {
                for (Perro perro : perros) {
                    if (perro.getNombre().equals(nperro)) {
                        System.out.println("¡Felicidades! Has adoptado un perro"
                                + "..." + perro.getNombre());
                        persona.setPerro(perro);
                        
                        
                        
                        
                    }

                }
            }

        }
        
        */

    }

}
