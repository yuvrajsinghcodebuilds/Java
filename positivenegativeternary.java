import java.util.Scanner;

public class positivenegativeternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number:");
        int a = sc.nextInt();
        
        String result = (a >= 0) ? "Positive" : "Negative";

        System.out.println("Your Number is :" + result);
        sc.close();
       

    }
    
}
