package interfacelatestdemo;

public class InValidOTPException extends Exception{
    private String code;
    public InValidOTPException(String errorCode,String message){
        super(message);
        this.code=errorCode;
    }
    public String getCode(){
        return code;
    }
}
