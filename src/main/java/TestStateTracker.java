public class TestStateTracker {

    public static void main(String[] args) {

        StateTracker stateTracker = new StateTracker();

        stateTracker.createBoard();
        stateTracker.addShip();

        System.out.println("Taking 5 attacks...");


        System.out.println(stateTracker.takeAttack(3,3));
        System.out.println(stateTracker.takeAttack(3,4));
        System.out.println(stateTracker.takeAttack(3,5));
        System.out.println(stateTracker.takeAttack(3,6));
        System.out.println(stateTracker.takeAttack(3,7));


        System.out.println("Has this player lost the game? " + stateTracker.hasLost());
    }
}
