import java.util.Scanner;

public class AgeClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for their age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Step 2: Classify using if–else–if–else ladder
        if(age >= 0 && age <= 12) {
            System.out.println("You are a Child.");
        } else if(age >= 13 && age <= 19) {
            System.out.println("You are a Teenager.");
        } else if(age >= 20 && age <= 59) {
            System.out.println("You are an Adult.");
        } else if(age >= 60) {
            System.out.println("You are a Senior Citizen.");
        } else {
            System.out.println("Invalid age entered!");
        }

        sc.close();
    }
}
