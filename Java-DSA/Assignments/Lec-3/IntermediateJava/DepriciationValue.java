
import java.util.Scanner;

public class DepriciationValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original value : ");
        double original = sc.nextDouble();
        System.out.print("Enter rate of depriciation : ");
        double rate = sc.nextDouble(); 
        System.out.print("Enter time : ");
        double time = sc.nextDouble();

        System.out.printf("%.2f is the depreciated value.", (original*Math.pow((1-(rate/100)), time)));
    }
}
