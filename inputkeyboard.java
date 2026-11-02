import java.util.Scanner;
public class inputkeyboard {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter Your Age:");
        int age = sc.nextInt();
        System.out.println("Your Age Is:" + age);
        sc.close();
    }
}
