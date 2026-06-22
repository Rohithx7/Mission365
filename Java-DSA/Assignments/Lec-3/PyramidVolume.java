import java.util.Scanner;

public class PyramidVolume {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter breadth of base of pyramid : ");
        double breadth = sc.nextDouble();
        System.out.print("Enter length of base of pyramid : ");
        double length = sc.nextDouble();
        System.out.print("Enter height of pyramid : ");
        double height = sc.nextDouble();
        double Volume = length*breadth*height/3 ;
        System.out.printf("%.2f is the volume of Pyramid.",Volume);
}    
}
