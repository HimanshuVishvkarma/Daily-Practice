import java.util.*;
 class switchCase{
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your week Day:");
        int n = sc.nextInt();
        switch (n) {
               case 1:
               System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");

                break;
                case 3:
                System.out.println("Wednesday");

                break;
                case 4:
                System.out.println("Thurseday");

                break;
                case 5:
                System.out.println("Suterday");

                break;

                case 6  :
                System.out.println("Sunday");

                break;
        
            default:
            System.out.println("Enter Valid Number / Under 7 :");

                break;
        }
        
    }
}