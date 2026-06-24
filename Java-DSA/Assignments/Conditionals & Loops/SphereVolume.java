import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of sphere : ");
        double radius = sc.nextDouble();
        double Volume = (4/3)*Math.PI*radius*radius*radius;
        System.out.printf("%.2f is the volume of Sphere.",Volume);
    }
}
