
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int product = product(n1,n2);
        System.out.println("Product. : " + product);
    }
    static int product(int n1, int n2){

        return n1*n2;
    }
}
