package interfacelatestdemo;

public enum ErrorCodes {
    NEOTERIC_INVALID_OTP_1000("NeoTech_1000","Invalid OTP"),
    NEOTERIC_INVALID_OTP_1001("NeoTech_1001","Expire OTP");
    String code;
    String message;


    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ErrorCodes(String errorcode, String message) {
        this.code = errorcode;
        this.message = message;
    }
}
