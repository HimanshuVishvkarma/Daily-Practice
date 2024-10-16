import java.util.Scanner;
public class numprimeornot {
    public static boolean PrimeOrNot(int n){
        boolean num = true;
              if(n<=1) return false;
              for (int i = 2; i < n; i++) {
                if (n%i==0) {
                    num = false;
                }
              }
              return num;
         }
   public static void main(String[] args) {
       System.out.println("Enter Your Number:");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      System.out.println(PrimeOrNot(n));
      
   }
}
