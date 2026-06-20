import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle = ");
        double radiusCircle = sc.nextInt();
        double perimeter = 2*(Math.PI)*radiusCircle; 
        System.out.printf("%.2f is perimeter of Circle.",perimeter);
    }
}
