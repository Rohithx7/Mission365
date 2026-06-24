import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total amount : ");
        double amount = sc.nextDouble();
        System.out.println("Enter commission percentage : ");
        double CommissionPercentage = sc.nextDouble();
        System.out.printf("Commision percentage is %.2f",(amount*CommissionPercentage)/100);
    }
}
