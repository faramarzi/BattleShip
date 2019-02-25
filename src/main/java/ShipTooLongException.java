public class ShipTooLongException extends RuntimeException {
    public ShipTooLongException() {
        super("Ship is too long and can not be placed on board!");
    }
}
