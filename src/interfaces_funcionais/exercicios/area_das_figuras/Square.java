package interfaces_funcionais.exercicios.area_das_figuras;

public record Square(int side) implements GeometricForm {
    @Override
    public double getArea() {
        return side * side;
    }
}
