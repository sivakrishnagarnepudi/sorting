package sorting;

public class EvenNumberException  {





    // Your loop where you're presumably changing the value of i goes here

    public static void main(String[] args) throws NotEvenException {
        int i = 0;
        while (i<=3){
        try {
            if (i!=0){
                throw new NotEvenException("NeoTech_1000","Invalid OTP");
        }    else{
                System.out.println("even");
                throw new CustomRunTimeException("NeoTech_1000","NeoTech_1000"+"100");
            }
        }catch (NotEvenException notEvenException){
            System.out.println(notEvenException.getMessage()+"even number");
        }catch (CustomRunTimeException e){
            System.out.println(e.getMessage()+"siva");
        }
       i++;}
    }

                // Add code to update or change the value of i here



}
