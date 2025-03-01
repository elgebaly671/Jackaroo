package exception;

public class SplitOutOfRangeException extends InvalidSelectionException {
    public SplitOutOfRangeException() {
        super("Split out of range.");
    }

    public SplitOutOfRangeException(String message) {
        super(message);
    }
}
