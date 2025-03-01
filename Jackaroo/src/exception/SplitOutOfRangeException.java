package exception;

public class SplitOutOfRangeException extends InvalidSelectionException {
    public SplitOutOfRangeException() {
        super("Split distance is out of range.");
    }

    public SplitOutOfRangeException(String message) {
        super(message);
    }
}
