package sorting;

public class NumberWithOutArray {
    public static void main(String[] args) {
        int number = 987654, rem,rev = 0;
        System.out.println("triangle order");

            for (int i = 0; i <6; i++) {

                    rem=number%10;
                    rev = rev*10+rem;

                    number = number /10;

                System.out.println(rev);
                }

        System.out.println("StraightOrder");
            for (int i=rev;rev>0;rev=rev/10){
                rem= rev%10;
                System.out.println(rem);

            }
            }
        }



