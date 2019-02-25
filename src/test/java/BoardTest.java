import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BoardTest {

    private Board board;


    @Before
    public void setUp() throws Exception {

        board = new Board(10,10);
    }

    @Test(expected = ShipTooLongException.class)
    public void addShip() {

        board.addShip(new Point(3,3), new Point(3,10));
    }

    @Test(expected = PointAlreadyTakenException.class)
    public void addShip1() {

        board.addShip(new Point(3,3), new Point(3,9));
        board.addShip(new Point(3,5), new Point(3,8));
    }

    @Test
    public void takeAttack() {

        board.addShip(new Point(3,3), new Point(3,9));
        assertTrue(board.takeAttack(new Point(3,6)));
        assertFalse(board.takeAttack(new Point(4,5)));
    }
}