
import java.util.Scanner;

public class TraingleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base of Triangle : ");
        double base = sc.nextInt();
        System.out.print("Enter Height of Triangle = ");
        double height = sc.nextInt();

        double area = base*height/2;
        System.out.printf("%.2f is area of triangle.",area);
    }
    
}
