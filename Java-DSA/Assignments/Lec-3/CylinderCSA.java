
import java.util.Scanner;

public class CylinderCSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of base of Cylinder : ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of cylinder : ");
        double height = sc.nextDouble();
        double Csarea = 2*Math.PI*radius*height;
        System.out.printf("%.2f is the Curver Surface area of Cylinder.",Csarea); 

    }
}
