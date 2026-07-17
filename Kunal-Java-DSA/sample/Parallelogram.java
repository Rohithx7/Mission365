import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base of Parallelogram = ");
        double base = sc.nextInt();
        System.out.print("Enter Height of Parallelogram = ");
        double height = sc.nextInt();
        double area = base*height; //area of Parallelogram is bxh
        System.out.printf("%.2f is area of Parallelogram.",area);
    }
}
