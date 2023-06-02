package models;

public class Amarre {
    private int numeroAmarre;
    private boolean ocupado;

    public Amarre(int numeroAmarre, boolean ocupado) {
        this.numeroAmarre = numeroAmarre;
        this.ocupado = ocupado;
    }

    public int getNumeroAmarre() {
        return numeroAmarre;
    }

    public void setNumeroAmarre(int numeroAmarre) {
        this.numeroAmarre = numeroAmarre;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        if (ocupado){
            return numeroAmarre + " OCUPADO";
        }else{
            return numeroAmarre + " LIBRE  ";
        }
    }
}
