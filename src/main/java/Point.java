import java.util.Objects;

public class Point {

    private int x; // row number for the point
    private int y; // column number for the point

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            return ((Point) obj).getX() == x && ((Point) obj).getY() == y;
        }

        return false;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }


}



