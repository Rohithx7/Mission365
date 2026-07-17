
import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int temp = 0;
        while(n > 0){
             temp = temp * 10 + n % 10;
                n = n / 10;
            }
        System.out.println("temp" + temp);
        if(temp == num){
            System.out.println("Palindrome");
        }
        else {System.out.println("Not palindrome");}
    }
}
