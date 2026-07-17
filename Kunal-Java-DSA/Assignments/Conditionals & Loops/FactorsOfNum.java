import java.util.Scanner;
public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int num = sc.nextInt(); //number input of integer type
        System.out.println("All Factors of the given number are");
        for(int i =1;i*i<=num;i++){
            if(num%i == 0){
              System.out.print(i + " ");
              int otherI = num/i;
              System.out.println(otherI + " ");
            }


        }

    }
}
