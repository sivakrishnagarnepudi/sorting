package sorting;

public class PalindromSeries {
    public static void main(String[] args)
    {
        int rem, rev= 0, temp;
        int n=122;
        temp=n;


        // Modify while loop to for loop
        for (; n != 0; n /= 10)

        {

            rem= n % 10;
            rev= rev * 10 + rem;
        }

        if (temp == rev)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");
    }
}
