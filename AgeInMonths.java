import java.util.Scanner;

public class AgeInMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for age in years
        System.out.print("Enter your age in years: ");
        int ageYears = sc.nextInt();

        // Step 2: Convert years to months
        int ageMonths = ageYears * 12;

        // Step 3: Print the result
        System.out.println("You are approximately " + ageMonths + " months old.");

        sc.close();
    }
}
