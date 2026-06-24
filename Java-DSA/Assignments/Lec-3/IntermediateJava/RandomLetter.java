
import java.util.Random;
import java.util.Scanner;

public class RandomLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
         Random random = new Random();
       while(true){
             str = sc.next();
            if(str.equals("x")){break;}
              int index = random.nextInt(str.length());
              System.out.println(str.charAt(index));
        }
             
    }
}
