
import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total runs scored. ");
        int runs = sc.nextInt();
        System.out.println("Enter no of times out.");
        int outs = sc.nextInt();

        System.out.println("Batting average is " + (runs/outs));

    }
}
