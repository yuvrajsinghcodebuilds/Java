import java.util.Scanner;


public class tablescanner {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         // Step 1: Ask the user for a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Print multiplication table up to 10
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();                                      
    }
}

