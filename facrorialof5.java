public class facrorialof5 {
    public static void main(String[] args) {
        int n = 1;
        
        int i = 5;
        int factorial = 1;
        while(i>=n){
            factorial = factorial*i;
            i--;
        }
        System.out.println("Factorial is:" + factorial);
    }
}
