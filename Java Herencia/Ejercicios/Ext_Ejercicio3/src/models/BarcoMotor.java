package models;

public class BarcoMotor extends Barco {
    private int CaballoVapor;

    public BarcoMotor(String matricula, double eslora, int anioFabricacion, int caballoVapor) {
        super(matricula, eslora, anioFabricacion);
        CaballoVapor = caballoVapor;
    }

    @Override
    public double modulo() {
        return super.modulo() + this.CaballoVapor;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" +
                "CaballoVapor=" + CaballoVapor +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
