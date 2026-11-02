import java.util.Scanner;

public class trafficlight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Color:");
        String color = sc.next();

        switch(color){
            case "red" :
                System.out.println("Stop");
                break;

                case "yellow" :
                    System.out.println("Wait");
                    break;

                    case "Green" :
                        System.out.println("Go");
                        break;

                        default :
                        System.out.println("Invalid Color!");
                        break;

                       

        }
        sc.close();
        
    }
}

    
