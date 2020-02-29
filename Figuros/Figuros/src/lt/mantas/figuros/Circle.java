package lt.mantas.figuros;

public class Circle extends Figure {

    private double r;

    public Circle (double r) {
        if (r <= 0) {
            //TODO rodyti klaida
        }
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
