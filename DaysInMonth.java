import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for a month number
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        // Step 2: Use switch to determine days
        switch(month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                System.out.println("31 days");
                break;

            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                System.out.println("30 days");
                break;

            case 2:  // February
                System.out.println("28 or 29 days (depending on leap year)");
                break;

            default:
                System.out.println("Invalid input! Please enter a number between 1 and 12.");
        }

        sc.close();
    }
}
