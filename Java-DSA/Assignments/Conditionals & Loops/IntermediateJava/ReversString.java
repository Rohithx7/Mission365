
import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.next();
     String reverse = "";
     for(int i =0;i<str.length();i++){
        reverse += str.charAt(str.length()-i-1);
     }
     System.out.println(reverse);

    }

}
