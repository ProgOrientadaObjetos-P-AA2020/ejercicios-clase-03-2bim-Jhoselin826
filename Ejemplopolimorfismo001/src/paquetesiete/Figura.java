package paquetesiete;

public abstract class Figura {

    protected double calcular_Area;
    protected String ca;

    public void establecerCarac(String c) {
        ca = c;
    }

    public abstract void calcular_Area();

    public double obtenerArea() {
        return calcular_Area;
    }

    public String obtenerCa() {
        return ca;
    }
}