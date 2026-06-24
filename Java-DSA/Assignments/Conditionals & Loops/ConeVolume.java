import java.util.Scanner;

public class ConeVolume {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of cone = ");
        double height = sc.nextInt();
        System.out.print("Enter radius of base of  cone = ");
        double radius = sc.nextInt();
        double volume = Math.PI*radius*radius*height/3;
        System.out.printf("%.2f is voume of cone.",volume);
    }
        
}
