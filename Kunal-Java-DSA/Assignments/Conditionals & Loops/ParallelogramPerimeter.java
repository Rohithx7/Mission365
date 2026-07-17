import java.util.Scanner;

public class ParallelogramPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1 of Parallelogram = ");
        double side1 = sc.nextInt();
        System.out.print("Enter side2 of Parallelogram = ");
        double side2 = sc.nextInt();
        double perimeter = 2*(side1+side2); //area of Parallelogram is bxh
        System.out.printf("%.2f is perimeter of Parallelogram.",perimeter);
    }
}
