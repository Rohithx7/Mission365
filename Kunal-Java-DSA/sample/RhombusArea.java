import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base of Diagonal 1 of Rhombus = ");
        double dia1 = sc.nextInt();
        System.out.print("Enter Height of Diagonal 2 of Rhombus = ");
        double dia2 = sc.nextInt();
        double area = dia1*dia2/2; //area of rhombus is 1/2 of product of diagonals of same. 
        System.out.printf("%.2f is area of Rhombus.",area);
    }
    
}
