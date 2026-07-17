
import java.util.Scanner;

public class PowerJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for power : ");
        double num = sc.nextDouble();
        System.out.println("Enter exponent : ");
        double pow = sc.nextDouble();
        System.out.println( "Power is " + Math.pow(num, pow));
    }
}
