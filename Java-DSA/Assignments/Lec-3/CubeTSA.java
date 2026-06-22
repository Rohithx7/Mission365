import java.util.Scanner;

public class CubeTSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of cube : ");
        double side = sc.nextDouble();
        double Tsarea = 6*side*side;
        System.out.printf("%.2f is the Total Surface Area of Cube.",Tsarea); 
    }
}
