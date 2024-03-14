package sorting;

public class CustomRunTimeException extends RuntimeException{
    private String code;
    public CustomRunTimeException(String errorCode,String message){
        super(message);
        this.code=errorCode;
    }
    public String getCode(){
        return code;
    }
}
