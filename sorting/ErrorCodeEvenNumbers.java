package sorting;

public enum ErrorCodeEvenNumbers {
    NEOTERIC_INVALID_OTP_1000("NeoTech_1000","Invalid OTP");

    String code;
    String message;
    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    ErrorCodeEvenNumbers(String errorcode, String message) {
        this.code = errorcode;
        this.message = message;
    }
}
