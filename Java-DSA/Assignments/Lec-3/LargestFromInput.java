
import java.util.Scanner;
//Take integer inputs till the user enters 0 and print the largest number from all.
public class LargestFromInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int max =0;
        while(true){
            int num  = sc.nextInt();

            if((num)==0){
               
               break; 

            }
            
            if(max <= num){

                max = num;
            }

        }

        System.out.println("Max value = " + max);
    }
}
