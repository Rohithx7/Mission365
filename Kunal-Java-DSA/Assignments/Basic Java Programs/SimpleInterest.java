import java.util.Scanner;
public class SimpleInterest {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your princple = ");
        long principle = sc.nextLong();
        System.out.println("Enter time = ");
        int time = sc.nextInt();        
        System.out.println("Enter rate = ");
        double rate = sc.nextDouble();

        double sInterest = principle*time*rate/100;

        System.out.println("Simple Interest for princple " + principle  + 
        " , time "+ time +
        "and rate" + rate +
         " = " + sInterest);




        sc.close();


    }
}
