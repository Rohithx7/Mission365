
import java.util.Scanner;

public class AllPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        allPrimes(num1, num2);
    }
    static void allPrimes(int n1, int n2){
        int max = n1 >n2 ? n1:n2;
        int min = n1 >n2 ? n2:n1;

        for(int i = min; i<max;i++ ){
             isPrime(i);
            }
            
        }
    
    static void isPrime(int num){
    boolean isPrime = true;
    if(num<=0){System.out.println(isPrime = false);}
    for(int i = 2 ;i<num;i++){
        if(num%i == 0){
            isPrime = false;
        }
    
    }
    if(isPrime){System.out.println(num); }
    }

}
