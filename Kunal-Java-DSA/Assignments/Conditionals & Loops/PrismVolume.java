import java.util.Scanner;

public class PrismVolume {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base of Prism = ");
        double base = sc.nextInt();
        System.out.print("Enter Height of Prism = ");
        double height = sc.nextInt();
        double volume = base*height;
        System.out.printf("%.2f is voume of Prism.",volume);
    }
        
}
