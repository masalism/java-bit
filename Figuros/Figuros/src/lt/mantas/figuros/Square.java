package lt.mantas.figuros;

public class Square extends Rectangular implements Dimension {

    public Square(double width) {
        super(width, width);
    }

    public Square(double width, int color) {
        this(width);
        setColor(color);
    }

    @Override
    public void dimensions(double area) {
        double x = Math.sqrt(area);
        setHeight(x);
        setWidth(x);
    }
}