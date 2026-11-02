import java.util.Scanner;

public class squarecubeinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int a = sc.nextInt();

        int square = a * a;
        System.out.println("The Square Of a Number Is :" + square);

        int cube = a * a * a;
        System.out.println("The Cube Of a Number Is:" + cube);

        sc.close();
    }
    
}
