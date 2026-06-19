import java.util.*;
public class RectangleArea {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rectangle's breadth : ");
        double breadth = sc.nextDouble();
        System.out.println("Enter the rectangle's height : ");
        double height = sc.nextDouble();
        double area = breadth*height;
        System.out.printf("%.2f is area of rectangle",area);
    }


    
}
