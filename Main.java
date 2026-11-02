public class Main {
    public static void main(String[] args) {
        int factorial = 1;

        for (int i = 1; i <= 8; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}