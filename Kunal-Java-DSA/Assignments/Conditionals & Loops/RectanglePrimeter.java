import java.util.Scanner;

public class RectanglePrimeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rectangle's 1st side  : ");
        double side1 = sc.nextDouble();
        System.out.println("Enter the rectangle's 2nd side : ");
        double side2 = sc.nextDouble();
        double perimeter = 2*(side1+side2);
        System.out.printf("%.2f is area of rectangle",perimeter);

    }
}
