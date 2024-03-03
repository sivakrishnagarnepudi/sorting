package sorting;

public class Test {
    public static void main(String[] args) {
        int num=54321;
        int rem;
        int rev=0;

        for(int i=num;num>0;num=num/10){
           rem= num%10;
           rev=rev*10+rem;
            System.out.println(rev);
        }

        for(int i=rev;rev>0;rev=rev/10){
            rem= rev%10;
            System.out.println(rem);
        }

    }
}
