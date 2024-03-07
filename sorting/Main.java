package sorting;


public class Main {
    public static void main(String[] args) {
        // args[] array contains command-line arguments
        // args.length gives the number of arguments passed

        System.out.println("Number of command-line arguments: " + args.length);

        // You can access each argument using its index in the args[] array
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }}
