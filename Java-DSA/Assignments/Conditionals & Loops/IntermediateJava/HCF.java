
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int max = num1 > num2 ? num1 : num2;
        int min = num1 > num2 ? num2 : num1;
        int hcf =  1;
        if(num1%num2 ==0){
            hcf = num2;
        }
        else if(num2%num1 ==0){
            hcf = num1;
        }
        else{
            for(int i =1; i<=min;i++){

                if(min%i ==0 && max%i == 0){

                    hcf=i;

                }


        }}

        System.out.println("HCF : " + hcf);

        
    }
}
