package lt.mantas.figuros;

public interface Color {

    int getColor();

    void setColor(int color);

    default void setDarker(int precent) {
        int color = getColor() * precent / 100;
        setColor(color);
    }
}
