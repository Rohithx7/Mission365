
import java.util.Scanner;

public class CountRepeat {
    static void main() {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        System.out.println("Enter checking counter : ");
        int x = sc.nextInt();
        int count = 0;
        while(num>0){


            if(x ==  num%10 ){

                count++;

            }

            num = num/10;
        }
        System.out.println(count);
    }
}
