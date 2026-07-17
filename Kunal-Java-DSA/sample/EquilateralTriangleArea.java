import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of equilateral triangle = ");
        double side = sc.nextInt();
        double area = (Math.sqrt(3)/4)*side*side; 
        System.out.printf("%.2f is area of Equilateral triangle.",area);
    }
}
