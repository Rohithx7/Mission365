
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //string palindrome ? 
        System.out.println("Enter string to check palindrom : ");
        String str = sc.nextLine();
        String str2 = ""; 

        for(int i=str.length()-1;i>=0;i--){

            str2 += str.charAt(i);

        }

        if(str.equalsIgnoreCase(str2)){
            System.out.println(str + " is palindrome");
        }
        else {System.out.println(str + " is not a palindrome");}

    }
    
}
