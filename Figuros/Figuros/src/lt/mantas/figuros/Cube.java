package lt.mantas.figuros;

public class Cube extends Figure3D {
    private double x;

    public Cube(double x) {
        this.x = x;
    }

    @Override
    public double area() {
        return x * x * 6;
    }

    @Override
    public double volume() {
        return x * x * x;
    }
}
