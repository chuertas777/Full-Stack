package models;

import java.util.ArrayList;

public class Muelle {
    private ArrayList<Amarre> amarres= new ArrayList<>();

    public Muelle() {
    }

    public Muelle(ArrayList<Amarre> amarres) {
        this.amarres = amarres;
    }
    public void crearMuelle(int cantidadAmarres){
        for (int i = 0; i < cantidadAmarres; i++) {
            this.amarres.add(new Amarre((i+1),false));
        }
    }
    public void imprimirMuelle(){

        for (Amarre amarre:amarres) {
            System.out.println("|=====================|");
            System.out.println("|                     |");
            System.out.println("|     "+amarre+ "       |");
            System.out.println("|                     |");
            System.out.println("|=====================|");
        }
    }
    public void validarAmarre(int numeroMuelle){

    }
}
