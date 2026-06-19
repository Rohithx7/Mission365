
import java.util.Scanner;

public class FibonacciSeries {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series");
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1;
        int count = 2;
//        System.out.print(a + " ");
//        System.out.print(b);
//        for(int i=3;i<=n;i++){
//            sum = a+b;
//            a = b;
//            b = sum;
//            System.out.print(" "+b);
//        }
//        for(int i=3;i<=n;i++){
//            sum = a+b;
//            a = b;
//            b = sum;
//
//        }
//
//        System.out.print("nth fibonacci = "+b);

        while(count < n ){

           int sum = a+b;
            a=b;
            b=sum;
            count++;
        }

        System.out.println("nth fibonacci = "+b);



    }
}
