
import java.util.Scanner;

public class PythagoranTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        isPythTriplet(num1,num2,num3);
    }
    static void isPythTriplet(int n1, int n2, int n3){

        if(n1*n1 == n2*n2 + n3*n3 || n2*n2 == n1*n1 + n3*n3 || n3*n3 == n1*n1 + n2*n2){
            System.out.println("Yes! Pythagoran Triplet.");
        }
        else {System.out.println("Not a Pythagoran Triplet.");}
    }
}
