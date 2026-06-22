import java.util.Scanner;

public class SumOfAll {
    //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            
            int num = sc.nextInt();
            if(num !=0){
            sum += num;}
            else{break;}

        }
        System.out.println("sum is : "+sum);
    }
}
