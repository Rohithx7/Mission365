import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial investment : ");
        double investment = sc.nextDouble();
        System.out.println("Enter Annual interest rate : ");
        double investmentRate = sc.nextDouble()/1200;
        System.out.println("Enter Number of Years : ");
        int years = sc.nextInt();

        double FutureInvestment = investment*Math.pow((1+investmentRate),(years*12));
        System.out.println(FutureInvestment);
    }
}
