import java.util.Scanner;
public class scannerAdd2digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Your Second Number:");
        int b = sc.nextInt();

        System.out.println("Sum Of 2 Numbers:" + (a+b));
        sc.close();
    }
    
}
