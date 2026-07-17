
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle : ");
        double principle = sc.nextDouble();
        System.out.println("rate of interest : ");
        double rate = sc.nextDouble();
        System.out.println("Enter time : ");
        int time = sc.nextInt();
        double CompAmount = principle*Math.pow((1+(rate/100)), time); // p(1-r/n)^n*t
        System.out.println("CompAmount : " + CompAmount);
    }
}
