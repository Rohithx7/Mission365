
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check the armstrong : ");
        int num = sc.nextInt() ;
       int length = 0; 
        int sum = 0;
        int compare = num;
        int digitCounter = num;
        while(digitCounter>0){
            length++;
            digitCounter = digitCounter/10;
        }
        for(int i=0;i<length;i++){
            
            sum += (int)Math.pow(num%10, length);
            num = num/10;
        }

        if(sum == compare){
            System.out.println(sum + " is Armstrong.");
        }
        else {
            System.out.println(sum + " is not Armstrong.");

        }

        
    }
}
