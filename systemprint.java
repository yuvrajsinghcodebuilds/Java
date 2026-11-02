public class systemprint {
    public static void main(String[] args) {
        //Use Of Ln in System.out Print
        System.out.println("Hello");
        System.out.println("World"); //ln helps in breaking statement from next line
        //Simple Use Of System.out Print
          System.out.print("Hello");
        System.out.print("World");//here we can see the statement is joined despite writing code in diff lines

        //Formated System Print
        String name = "lucky";
        int age = 20;
        System.out.printf("Name: %s , Age: %n", name , age);
    }
}
