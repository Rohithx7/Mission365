
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter how many terms in Fibonacci series needed  : ");
        int n = sc.nextInt();
        int a = 0;
        System.out.print(a + " ");
        int b = 1;
        System.out.print(b + " ");
         for(int i = 0; i < n - 2; i++) {
                 int sum = a + b;
                  System.out.print(sum + " ");
                 a = b;
                 b = sum;
}

    }
}
