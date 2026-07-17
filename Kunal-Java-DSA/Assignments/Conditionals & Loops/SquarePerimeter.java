import java.util.Scanner;

public class SquarePerimeter {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square = ");
        int side = sc.nextInt();
        double perimiter = 4*side ;
        System.out.printf("Area of circle %.2f", perimiter);
    }
}
