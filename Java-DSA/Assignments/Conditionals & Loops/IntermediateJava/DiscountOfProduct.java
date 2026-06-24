
import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter MRP : ");
        int price = sc.nextInt();
        System.out.println("Enter discount percentage : ");
        double discount = sc.nextDouble();

        System.out.println("Discounted price is : " + ((double)price-(discount)*price/100));

    }
}
