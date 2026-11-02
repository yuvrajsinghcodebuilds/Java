import java.util.Scanner;

public class incrementdecrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Apply pre-increment
        int incremented = ++num;  // num is increased first

        // Step 3: Apply pre-decrement
        int decremented = --num;  // num is decreased immediately after

        // Step 4: Print the results
        System.out.println("After pre-increment, value is: " + incremented);
        System.out.println("After pre-decrement, value is: " + decremented);

        sc.close();
    }
}