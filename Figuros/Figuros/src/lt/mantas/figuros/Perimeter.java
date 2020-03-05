package lt.mantas.figuros;

public interface Perimeter {
    double perimeter();

    default double hPerimeter() {
        return perimeter() / 2;
    };
}
