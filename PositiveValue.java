import java.util.Scanner;

public class PositiveValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Apply unary plus operator
        int positiveNum = +num;

        // Step 3: Print the result
        System.out.println("The positive value of " + num + " is: " + positiveNum);

        sc.close();
    }
}
