import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShipTest {

    HorizontalShip horizontalShip;

    @Before
    public void setUp() throws Exception {
        horizontalShip = new HorizontalShip(new Point(3,3), new Point(3, 7));
    }

    @Test
    public void hasSunk() {

        assertTrue(horizontalShip.takeHit(new Point(3,3)));
        assertTrue(horizontalShip.takeHit(new Point(3,4)));
        assertTrue(horizontalShip.takeHit(new Point(3,5)));
        assertTrue(horizontalShip.takeHit(new Point(3,6)));
        assertTrue(horizontalShip.takeHit(new Point(3,7)));
        assertFalse(horizontalShip.takeHit(new Point(3,7)));

        assertTrue(horizontalShip.hasSunk());
    }

    @Test
    public void takeHit() {

        assertTrue(horizontalShip.takeHit(new Point(3,3)));
        assertTrue(horizontalShip.takeHit(new Point(3,4)));
        assertTrue(horizontalShip.takeHit(new Point(3,5)));
        assertTrue(horizontalShip.takeHit(new Point(3,6)));
        assertTrue(horizontalShip.takeHit(new Point(3,7)));
        assertFalse(horizontalShip.takeHit(new Point(3,7)));
    }
}