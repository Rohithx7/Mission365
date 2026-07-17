
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter total numbers : ");
        int n = sc.nextInt();
        System.out.println("Enter values : ");
        while(n>0) {
            int num = sc.nextInt();
            sum += num;
            n--;
        }
        System.out.println("Total Sum : "+sum);
    }
}
