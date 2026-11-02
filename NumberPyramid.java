public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5; // height of pyramid

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
