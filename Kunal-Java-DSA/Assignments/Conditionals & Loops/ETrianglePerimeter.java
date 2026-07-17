import java.util.Scanner;

public class ETrianglePerimeter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Equilateral Triangle = ");
        double side = sc.nextInt();
        double perimeter = 3*side; //area of Parallelogram is bxh
        System.out.printf("%.2f is Perimeter of equilateral triangle.",perimeter);
    }
}
