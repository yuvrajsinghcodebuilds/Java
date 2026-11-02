import java.util.Scanner;

public class tempratureternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter Temprature Value(IN CELSIUS)");
       int a = sc.nextInt();

       String result = ( a >= 30 ) ? "Hot" : "Cold";

       System.out.println("The temprature in Your Area is:" + result);
       sc.close();
    }
    
}
