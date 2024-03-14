package exceptionalhandeling;

public class InsufficientBalanceException extends RuntimeException{
    private final String code;

    public InsufficientBalanceException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
