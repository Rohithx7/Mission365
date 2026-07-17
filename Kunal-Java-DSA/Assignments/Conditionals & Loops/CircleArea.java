
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int radius = sc.nextInt();
        double area = Math.PI*radius*radius;
        System.out.printf("Area of circle %.2f", area);
    }
}
