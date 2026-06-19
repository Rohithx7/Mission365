
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("Num1 is largest");
        }
        else{
            System.out.println("Num2 is largest");
        }
     }
}
