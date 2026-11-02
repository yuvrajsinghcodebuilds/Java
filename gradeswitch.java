import java.util.Scanner;

public class gradeswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Grade:");
        String grade = sc.next();

        switch(grade){
            case "A" :
                System.out.println("Excellent");
                break;
                case "B" :
                    System.out.println("Good");
                    break;
                    case "C" :
                        System.out.println("Average");
                        break;
                        case "D" :
                            System.out.println("Poor");
                            break;
                            case "F" :
                                System.out.println("Fail");
                                break;
                                default :
                                System.out.println("Wrong Input Grade!");
            
        

            
        }
        sc.close();
    }
    
}
