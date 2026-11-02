import java.util.Scanner;

public class average3integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a = sc.nextInt();

        System.out.println("Enter Second Number:");
        int b = sc.nextInt();

        System.out.println("Enter third Number :");
        int c = sc.nextInt();

        int average = (a + b + c / 3);

        System.out.println("The Average is:" + average);
        sc.close();
    }
    
}
