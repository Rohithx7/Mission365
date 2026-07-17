
import java.util.Scanner;

public class isPrime {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean isPrime = isPrime(num);
    if(isPrime){System.out.println("Prime");}
    else{System.out.println("Not Prime");}
 }   
 static boolean isPrime(int num){
    boolean isPrime = true;
    if(num<=0){System.out.println(isPrime = false);}
    for(int i = 2 ;i<num;i++){
        if(num%i == 0){
            isPrime = false;
        }
    
    }

    return isPrime;

 }
}
