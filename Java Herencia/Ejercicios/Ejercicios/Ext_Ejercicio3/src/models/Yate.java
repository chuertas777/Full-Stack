package models;

public class Yate extends Barco{
    private int camarotes;
    private int caballoVapor;

    public Yate(String matricula, double eslora, int anioFabricacion, int camarotes, int caballoVapor) {
        super(matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
        this.caballoVapor = caballoVapor;
    }

    @Override
    public double modulo() {
        return super.modulo() + camarotes + caballoVapor;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "camarotes=" + camarotes +
                ", caballoVapor=" + caballoVapor +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
