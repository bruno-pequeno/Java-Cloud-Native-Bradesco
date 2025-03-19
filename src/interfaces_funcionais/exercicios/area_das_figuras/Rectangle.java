package interfaces_funcionais.exercicios.area_das_figuras;

public record Rectangle(double height, double base) implements GeometricForm {

    @Override
    public double getArea() {
        return base * height;
    }
}
