
import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPalindrome(num);
    }
    static void isPalindrome(int num){
        int length = count(num);
        int temp = num;
        int reverse = 0;
        for(int i=0;i<length;i++){

            reverse = reverse*10 + temp%10;
            temp /= 10;

        }
        // System.out.println("reverse : "+reverse);
        if(reverse == num ){System.out.println("Palindrome");}
        else {System.out.println("not palindrome.");}
    }
    static int count(int num){
        int length = 0;

        while(num>0){
            num = num/10;
            length++;
        }
        // System.out.println("length :" +length);
        return length;
    }

}
