package exceptionalhandeling;

public class ExceptionalDemoClient {
    public static void main(String []args){
        ExceptionService exceptionService=new ExceptionService();
        exceptionService.greet(null);
    }
}
