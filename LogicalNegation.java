import java.util.Scanner;

public class LogicalNegation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for a boolean value
        System.out.print("Enter a boolean value (true/false): ");
        boolean value = sc.nextBoolean();

        // Step 2: Apply logical NOT operator
        boolean negatedValue = !value;

        // Step 3: Print the result
        System.out.println("The negation of " + value + " is: " + negatedValue);

        sc.close();
    }
}
