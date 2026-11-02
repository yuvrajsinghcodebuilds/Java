import java.util.Scanner;

public class incrementby1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number");
        int a = sc.nextInt();
        a++;
        System.out.println("The increment value is:" + a);

        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        ++b;
        System.out.println("The Increment value is:"+ b);
        sc.close();

    }
    
}
