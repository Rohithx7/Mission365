
import java.util.Scanner;

class DistanceTwoPoints{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 : ");
        int x1 = sc.nextInt();
        System.err.print("Enter y1 : ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2 : ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2 : ");
        int y2 = sc.nextInt();

        int a = Math.powExact((x2-x1), 2);
        System.out.println(a);
        int b = Math.powExact((y2-y1), 2);
        System.out.println(b);

        System.out.printf("Distance between points is %.2f", Math.sqrt(a+b));

    }
}