package lt.mantas.figuros;

public class Figure {

    private int color; // 0 = juoda, 0xfffff - balta;
    private int x, y; // figuros koordinates plokstumoje

    public double perimetras () {
        return 0;
    }

    public double area() {
        return 0;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
