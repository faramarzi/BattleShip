import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class StateTracker {

    private Board board;
    private List<Ship> ships;

    public StateTracker() {

        ships = new LinkedList<>();
    }

    public void createBoard() {
        this.board = new Board(10,10); // From assumptions
        System.out.println("Board Created");
    }

    public void addShip() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Please enter x (row number) and y (column number) for starting point of your ship.");

            int startX = Integer.parseInt(reader.readLine());
            int startY = Integer.parseInt(reader.readLine());

            System.out.println("Please enter x (row number) and y (column number) for ending point of your ship.");


            int endX = Integer.parseInt(reader.readLine());
            int endY = Integer.parseInt(reader.readLine());

            try {

                ships.add(board.addShip(new Point(startX, startY), new Point(endX, endY)));

            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public boolean takeAttack(int x, int y) {
        return board.takeAttack(new Point(x,y));
    }

    public boolean hasLost() {
        for (Ship ship : ships) {
            if (!ship.hasSunk()) {
                return false;
            }
        }

        return true;
    }
}
