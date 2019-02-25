public class PointAlreadyTakenException extends RuntimeException {
    public PointAlreadyTakenException() {
        super("Ship needs a point which is already taken!");
    }
}
