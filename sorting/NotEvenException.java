package sorting;

public class NotEvenException extends Exception{
    private String code;
    public NotEvenException(String errorCode,String message){
        super(message);
        this.code=errorCode;
    }
    public String getCode(){
        return code;
    }
}
