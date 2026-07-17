
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index of fibo series to generare upto ");
        int n = sc.nextInt();

        // considering index of fibonacci starts with 0 
        int a = 0; // first term of fibo series
        int b = 1; // second term of fibo series
        System.out.print(0 + " ");
        System.out.print(1 + " ");


        for(int i = 1;i<n;i++){
            int sum = a+b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }




    }
    
}
