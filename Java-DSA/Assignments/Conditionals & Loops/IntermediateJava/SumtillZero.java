
import java.util.Scanner;

public class SumtillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNegative = 0;
        int sumPositive = 0;
        int sumOdd = 0;
        int n;
        while((n = sc.nextInt())!=0){
            
            if(n<0){
                sumNegative += n;
            }
             if(n>0){
                sumPositive += n;
                if(n%2 !=0){sumOdd += n;}
            }
            
        }
        System.out.println("Sum of positive : "+ sumPositive);
        System.out.println("Sum of negative" + sumNegative);
        System.out.println("Sum of Odd :"+sumOdd);
    }
}
