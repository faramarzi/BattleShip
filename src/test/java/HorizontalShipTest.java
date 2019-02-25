import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class HorizontalShipTest {

    @Test
    public void isValid() {

        assertTrue(HorizontalShip.isValid(new Point(3, 3), new Point(3, 3)));

        assertTrue(HorizontalShip.isValid(new Point(5,1), new Point(5,5)));

        assertFalse(HorizontalShip.isValid(new Point(3,4), new Point(7,3)));

        assertFalse(HorizontalShip.isValid(new Point(3,4), new Point(7,8)));

        assertTrue(HorizontalShip.isValid(new Point(4,4), new Point(4,2)));

    }

    @Test
    public void getPoints() {

        HorizontalShip horizontalShip = new HorizontalShip(new Point(3,3), new Point(3, 7));
        assertEquals(horizontalShip.getPoints().length, 5);
        List<Point> pointList = Arrays.asList(horizontalShip.getPoints());
        assertTrue(pointList.contains(new Point(3,3)));
        assertTrue(pointList.contains(new Point(3,4)));
        assertTrue(pointList.contains(new Point(3,5)));
        assertTrue(pointList.contains(new Point(3,6)));
        assertTrue(pointList.contains(new Point(3,7)));

        horizontalShip = new HorizontalShip(new Point(4,4), new Point(4,2));
        System.out.println(horizontalShip.length);
        System.out.println(horizontalShip.start.getX());
        System.out.println(horizontalShip.start.getY());
        System.out.println(horizontalShip.end.getX());
        System.out.println(horizontalShip.end.getY());

        pointList = Arrays.asList(horizontalShip.getPoints());

        assertTrue(pointList.contains(new Point(4,2)));
        assertTrue(pointList.contains(new Point(4,3)));
        assertTrue(pointList.contains(new Point(4,4)));
        assertEquals(pointList.size(), 3);
    }
}