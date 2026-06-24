
import java.util.Scanner;

public class AreaCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        area(radius);
        circumference(radius);
    }
    static void area(double radius){
        System.out.println("Area : " + Math.PI*radius*radius); 
    }
    static void circumference(double radius){
        System.out.println("Circumference : "+ 2*Math.PI*radius);
    }
}
