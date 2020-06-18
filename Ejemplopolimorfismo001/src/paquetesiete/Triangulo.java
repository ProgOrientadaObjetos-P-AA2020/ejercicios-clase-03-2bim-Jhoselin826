package paquetesiete;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public void establecerBase(double b) {
        base = b;
    }

    public void establecerAltura(double h) {
        altura = h;
    }
    
    @Override
    public void calcular_Area() {
        calcular_Area = (base * altura)/2;
    }

    public double obtenerBase() {
        return base;
    }

    public double obtenerAltura() {
        return altura;
    }
}
