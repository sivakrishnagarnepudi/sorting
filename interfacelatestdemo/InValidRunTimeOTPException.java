package interfacelatestdemo;

public class InValidRunTimeOTPException extends RuntimeException{
    private String code;
    public InValidRunTimeOTPException(String errerCode,String message){
        super(message);
        this.code=errerCode;
    }
    public String getCode(){
        return code;
    }

}
