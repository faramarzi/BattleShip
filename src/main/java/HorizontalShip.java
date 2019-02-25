
public class HorizontalShip extends Ship {

    public HorizontalShip(Point start, Point end) {
        this.start = start.getY() < end.getY() ? start : end;
        this.end = end.getY() > start.getY() ? end : start;
        length = this.end.getY() - this.start.getY() + 1;
    }

    public static boolean isValid(Point start, Point end) {
        return start.getX() == end.getX();
    }

    @Override
    public Point[] getPoints() {

        Point[] points = new Point[length];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(start.getX(),start.getY() + i);
        }

        return points;
    }
}
