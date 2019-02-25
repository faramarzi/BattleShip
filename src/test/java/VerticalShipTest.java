import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class VerticalShipTest {

    @Test
    public void isValid() {

        assertTrue(VerticalShip.isValid(new Point(3, 3), new Point(3, 3)));

        assertTrue(VerticalShip.isValid(new Point(3,7), new Point(6,7)));

        assertFalse(VerticalShip.isValid(new Point(5,6), new Point(5,8)));

        assertFalse(VerticalShip.isValid(new Point(3,4), new Point(7,8)));

    }

    @Test
    public void getPoints() {

        VerticalShip verticalShip = new VerticalShip(new Point(2,3), new Point(6,3));
        assertEquals(verticalShip.getPoints().length, 5);
        List<Point> pointList = Arrays.asList(verticalShip.getPoints());
        assertTrue(pointList.contains(new Point(2,3)));
        assertTrue(pointList.contains(new Point(3,3)));
        assertTrue(pointList.contains(new Point(4,3)));
        assertTrue(pointList.contains(new Point(5,3)));
        assertTrue(pointList.contains(new Point(6,3)));

        assertFalse(pointList.contains(new Point(7,8)));

        verticalShip = new VerticalShip(new Point(8,2), new Point(4,2));
        pointList = Arrays.asList(verticalShip.getPoints());

        assertTrue(pointList.contains(new Point(4,2)));
        assertTrue(pointList.contains(new Point(5,2)));
        assertTrue(pointList.contains(new Point(6,2)));
        assertTrue(pointList.contains(new Point(7,2)));
        assertTrue(pointList.contains(new Point(8,2)));
        assertEquals(pointList.size(), 5);
    }
}