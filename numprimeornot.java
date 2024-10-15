public class numprimeornot {
    public static boolean PrimeOrNot(int n){
       
        for(int i=2; i<=n; i++){
            if (n%i==0) {
             return false;
            }else{
               return true;
            }
            
        }
 
    }
    public static void main(String[] args) {
           int n;
        System.out.println(PrimeOrNot(5));
        }
}
