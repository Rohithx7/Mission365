import java.util.Scanner;

public class SubtractProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer to subtract the product and sum of digits : ");
        int num = sc.nextInt();
        if(num == 0|| num<0){
            System.out.println("Enter number greater than zero");
        }
        else {

            int product = 1;
            int sum = 0;

            while(num>0) {
                product *= num%10;
                sum += num%10;
                num = num/10;
            }

            System.out.println("Answer is " +(product-sum));

        }
    }
}
