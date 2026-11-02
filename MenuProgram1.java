import java.util.Scanner;

public class MenuProgram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

        } while (choice != 3);

        System.out.println("Program Ended");
        sc.close();
    }
}