import java.util.Scanner;

public class SwapWithXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for two numbers
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Step 2: Swap using XOR
        a = a ^ b;  // Step 1: a becomes a ^ b
        b = a ^ b;  // Step 2: b becomes (a ^ b) ^ b = a
        a = a ^ b;  // Step 3: a becomes (a ^ b) ^ a = b

        // Step 3: Print the swapped values
        System.out.println("After swapping: a = " + a + ", b = " + b);

        sc.close();
    }
}
