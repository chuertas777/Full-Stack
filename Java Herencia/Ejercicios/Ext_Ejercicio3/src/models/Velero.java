package models;

public class Velero extends Barco{
    private int numeroMastiles;

    public Velero(String matricula, double eslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double modulo() {
        return super.modulo() + this.numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "numeroMastiles=" + numeroMastiles +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
