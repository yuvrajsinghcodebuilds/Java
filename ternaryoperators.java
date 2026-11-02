import java.util.Scanner;

public class ternaryoperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a = sc.nextInt();

        System.out.println("Enter Second Number:");
        int b = sc.nextInt();

     // Step 2: Apply bitwise operators
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        int complementA = ~a;
        int complementB = ~b;

        // Step 3: Print the results
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Bitwise AND (a & b): " + andResult);
        System.out.println("Bitwise OR (a | b): " + orResult);
        System.out.println("Bitwise XOR (a ^ b): " + xorResult);
        System.out.println("Bitwise Complement of a (~a): " + complementA);
        System.out.println("Bitwise Complement of b (~b): " + complementB);

        sc.close();
        
        

    }
    
}
