
import java.util.Scanner;

public class isElgibletoVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        isEligible(age);
    }
    static void isEligible(int age){

        if(age >= 18) {System.out.println("Elgible");}
        else {System.out.println("Not Eligible");}
    }
}
