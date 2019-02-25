public class InvalidPointsException extends RuntimeException {

    public InvalidPointsException() {
        super("No horizontal or vertical ship can be built using these points!");
    }
}
