import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Circle Radius:");
        int Radius = sc.nextInt();

        double area = 3.1477*(Radius*Radius);
        System.out.println("Area Of Circle is" + area);
        sc.close();
    }
}
