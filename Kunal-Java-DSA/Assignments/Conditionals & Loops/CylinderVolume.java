import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of base of Cylinder : ");
        double radius = sc.nextDouble();
        System.out.print("Perpendicular Height : ");
        double PerpenHeight = sc.nextDouble();
        double Volume = Math.PI*radius*radius*PerpenHeight;
        System.out.printf("%.2f is the volume of Cylinder.",Volume);

    }
}
