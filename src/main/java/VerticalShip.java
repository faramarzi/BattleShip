public class VerticalShip extends Ship {

    public VerticalShip(Point start, Point end) {

        this.start = start.getX() < end.getX() ? start : end;
        this.end = end.getX() > start.getX() ? end : start;
        length = this.end.getX() - this.start.getX() + 1;
    }

    public static boolean isValid(Point start, Point end) {
        return start.getY() == end.getY();
    }

    @Override
    public Point[] getPoints() {

        Point[] points = new Point[length];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(start.getX() + i, start.getY());
        }

        return points;
    }
}
