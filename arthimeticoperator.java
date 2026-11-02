import java.util.Scanner;

public class arthimeticoperator {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter First Number:");
   int a = sc.nextInt();

   System.out.println("Enter Second Number:");
   int b = sc.nextInt();
   
    int sum = a + b;
    

    int diff = a - b;
    
    int multiply = a * b;

    int div = a / b;

    int mod = a % b;

    System.out.println("Sum is:" + sum);
    System.out.println("The Difference is:" + diff);
    System.out.println("The Multiplication is:" + multiply);
    System.out.println("The Divison is:" + div);
    System.out.println("The Modulo is:" + mod);
    sc.close();

}
    
    
}
