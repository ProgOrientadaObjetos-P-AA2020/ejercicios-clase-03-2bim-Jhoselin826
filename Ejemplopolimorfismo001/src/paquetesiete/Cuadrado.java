package paquetesiete;

public class Cuadrado extends Figura {

    private double lado;

    public void establecerLado(double l) {
        lado = l;
    }

    @Override
    public void calcular_Area() {
        calcular_Area = lado * lado;
    }
}
