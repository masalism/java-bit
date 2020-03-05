package lt.mantas.figuros;

public class Circle extends Figure2D implements Dimension {

    private double r;
    private double area;

    public Circle(double r) {
        if (r <= 0) {
            // rodyti klaida
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " radius must be higher than 0");
        }
        this.r = r;
    }

    public Circle(double r, int color) {
        this(r); // kviecai tevini konstruktoriu
        setColor(color);
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public void dimensions(double area) {
        double x = Math.sqrt(area / Math.PI);
        setR(x);
    }

    public double getR() {
        return r;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setR(double r) {
        this.r = r;
    }
}
