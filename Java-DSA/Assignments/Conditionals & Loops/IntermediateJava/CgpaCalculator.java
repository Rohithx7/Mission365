
import java.util.Scanner;

public class CgpaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0; 
        double sum = 0;
        double marks;
        while((marks = sc.nextDouble()) != 0){
            sum = sum+marks;
            count++;
        }
        double cgpa = (double)(sum/count)/10;

        System.out.println("CGPA = "+ cgpa);
        System.out.printf("Percentage = %.2f",(cgpa*9.5));
    }
}
