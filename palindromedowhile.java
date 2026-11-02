public class palindromedowhile {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reverse = 0;
        do{
            int digit = num%10;
            reverse = reverse*10 +digit;
            num /= 10;
        }while(num > 0);

        if(original == reverse){
            System.out.println("This Is Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
    }
    
}
