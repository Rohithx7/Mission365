
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count = 0 ;
        double sum = 0;
        while(true){
            int num = sc.nextInt();
            if(num == 0 || num<0){break;}
            else{
            sum += num; 
            count++;}
        }
        System.out.printf("Average : %.2f",sum/count);
        

    }
}
