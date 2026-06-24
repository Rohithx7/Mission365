
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int min = num1 > num2 ? num2: num1;
        int lcm = 0;
        if(num2%num1 == 0){lcm = num2;}
        else if(num1%num2 == 0) {lcm = num1;}
        else {
            for(int i = 1; i<=num1;i++){
                for(int j=1;j<=num2;j++){
                    if(num1*i == num2*j){
                        lcm = num1*i;
                        break;
                    }
                    
                }
                if(lcm != 0) {
                  break;
                      }
            }
            
        }
        System.out.println(lcm);
    }
}
