import java.util.Scanner;

public class evenoddbitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Use bitwise AND to check even/odd
        String result = (num & 1) == 0 ? "Even" : "Odd";

        // Step 3: Print the result
        System.out.println(num + " is " + result);

        sc.close();
    }
}
