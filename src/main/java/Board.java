import java.util.*;

public class Board {

    private int rowCount;
    private int columnCount;

    private Map<Point,Ship> pointShipMap; // maintains point-to-ship mapping

    public Board(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;

        pointShipMap = new HashMap<>();
    }


    public Ship addShip(Point start, Point end) {

        Ship ship = Ship.build(start, end);

        Point[] points = ship.getPoints();

        for (Point point : points) {
            if (point.getX() >= rowCount || point.getY() >= columnCount) {
                throw new ShipTooLongException();
            }

            if (pointShipMap.keySet().contains(point)) {
                throw new PointAlreadyTakenException();
            }

            pointShipMap.put(point, ship);
        }

        return ship;
    }


    public boolean takeAttack(Point attackPoint) {

        if (pointShipMap.keySet().contains(attackPoint)) {
            pointShipMap.get(attackPoint).takeHit(attackPoint);
            return true;
        }

        return false;
    }
}
