package exceptionalhandeling;

public enum ErrorCodes {
    Login_Failed("1001", "Invalid Credentials"),
    Invalid_Input("1002", "Input is not given Properly"),
    Insufficient_Balance("1003", "Insufficient Balance");

    private final String code;
    private final String message;

    ErrorCodes(String errorCode, String message) {
        this.code = errorCode;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
