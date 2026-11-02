// import java.util.Scanner;

// public class comparsion2number {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);


//         System.out.println("Enter First Number:");
//         int a = sc.nextInt();

//         System.out.println("Enter Second Number:");
//         int b = sc.nextInt();

//         boolean greater  = (a > b);
//         boolean lesser = (a < b);
//         boolean equal = (a == b);

//         System.out.println(" a is greater than b" + greater);
//         System.out.println(" a is less than b" + lesser);
//         System.out.println(" a is equal to b" + equal);
//         sc.close();



//     }
    
// }
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for two integers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Step 2: Compare the numbers
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }

        sc.close();
    }
}

