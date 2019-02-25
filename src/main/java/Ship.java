import java.util.HashSet;
import java.util.Set;

public abstract class Ship {

    protected Point start; // position for start point of ship
    protected Point end; // position for end point of ship
    protected int length;
    private Set<Point> hitPoints; // Set of points in this ship which were hit

    public Ship() {

        hitPoints = new HashSet<>();
    }

    /*
    Checks weather a horizontal or vertical ship can be built with start and end points
    and returns the correct type of ship.
     */
    public static Ship build(Point start, Point end) {
        if (HorizontalShip.isValid(start, end)) {
            return new HorizontalShip(start, end);
        }

        if (VerticalShip.isValid(start, end)) {
            return new VerticalShip(start, end);
        }

        throw new InvalidPointsException();
    }

    public abstract Point[] getPoints();

    public boolean hasSunk() {
        return hitPoints.size() == length;
    }

    public boolean takeHit(Point p) {
        return hitPoints.add(p);
    }
}
