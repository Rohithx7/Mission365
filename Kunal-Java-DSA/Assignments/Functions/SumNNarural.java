
import java.util.Scanner;

public class SumNNarural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println(sumNatural(num));
    }
    static int sumNatural(int n){
        return n*(n+1)/2;
    }
}
