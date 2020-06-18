package paquetesiete;

public class Rombo extends Figura {

    private double diagonalMenor;
    private double diagonalMayor;

    public void establecerDiagonalMenor(double menor) {
        diagonalMenor = menor;
    }

    public void establecerDiagonalMayor(double mayor) {
        diagonalMayor = mayor;
    }

    @Override
    public void calcular_Area() {
        calcular_Area = (diagonalMayor * diagonalMenor) / 2;
    }

    public double obtenerDiagonalMenor() {
        return diagonalMenor;
    }

    public double obtenerDiagonalMayor() {
        return diagonalMayor;
    }

}
