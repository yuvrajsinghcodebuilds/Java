import java.util.Scanner;


public class degreetofarehnite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Temprature Value(Celsius):");
        int celsius = sc.nextInt();

        double farhenite = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "°C is equal to " + farhenite + "°F");
        sc.close();

    }
}
