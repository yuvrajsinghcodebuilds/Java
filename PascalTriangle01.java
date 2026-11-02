public class PascalTriangle01 {
    public static void main(String[] args) {
        int rows = 5; // You can change this value

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            int number = 1; // First number in each row
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                // Update number using formula: nCr = nCr-1 * (i - j) / (j + 1)
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}