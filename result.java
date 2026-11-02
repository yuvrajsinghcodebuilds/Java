import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Marks:");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("A");
        }else if(marks >= 75){
            System.out.println("B");
        }else if(marks >= 60){
            System.out.println("C");
        }else if(marks >= 40){
            System.out.println("D");
        }else if(marks >= 0)
            System.out.println("Fail");
        sc.close();
    }
    
}
