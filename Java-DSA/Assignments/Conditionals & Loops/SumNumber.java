
import java.util.Scanner;

public class SumNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2 : ");
        int num2 = sc.nextInt();

        System.out.println("Sum of two numbers : " + (num1+num2));
    }
}
