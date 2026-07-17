import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Hi! Who woke me up ? ");
        String name = sc.next(); // taking input name here
        sc.close();
        System.out.println("Good Day ! " + name.toUpperCase());

    }
    
}
