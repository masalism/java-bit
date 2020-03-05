package lt.mantas;

import java.util.Iterator;

public class Mano implements Iterable<Integer> {

    private Integer x, y, z;

    public Mano(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ManoIteratorius(this);
    }
}

class ManoIteratorius implements Iterator<Integer> {

    private Mano mano;
    private int nr = 0;

    public ManoIteratorius(Mano mano) {
        this.mano = mano;
    }

    @Override
    public boolean hasNext() {
        return nr <= 2;
    }

    @Override
    public Integer next() {
        switch (nr++) {
            case 0:
                return mano.getX();
            case 1:
                return mano.getY();
            case 2:
                return mano.getZ();
        }
        return 0;
    }
}
