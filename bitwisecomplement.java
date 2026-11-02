import java.util.Scanner;

public class bitwisecomplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int a = sc.nextInt();
         int complementA = ~a;

         System.out.println("The Complement Of a Number Is:" + complementA);
         sc.close();
    }
    
}
