
import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter currenct in Inr = ");

        double inr = sc.nextDouble();
        double usd = inr*0.011; // conversion rate as on 19june2026. 
        System.out.printf("%.2f INR equals %.2f USD%n",inr,usd);
    }
    
}