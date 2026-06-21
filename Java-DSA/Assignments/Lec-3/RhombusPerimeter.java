import java.util.Scanner;

public class RhombusPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base of Rhombus = ");
        double base = sc.nextInt();
        System.out.print("Enter Height of Rhombus = ");
        double height = sc.nextInt();
        double perimeter = 2*(base+height);
        System.out.printf("%.2f is area of Rhombus.",perimeter);
    }
        
}
