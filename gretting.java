import java.util.Scanner;

public class gretting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your First Name:");
        String firstname = sc.next();

        System.out.println("Please Enter Your Last Name:");
        String lastname = sc.next();

        System.out.println("Hello" + firstname + " " + lastname);
        sc.close();
    }
    
}
