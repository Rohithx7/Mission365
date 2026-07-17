
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int bill = 0; 

        if(units<=0){
            bill = 0;
        }
        else if(units>0 && units<=100) 
            { 
                bill = units*10; 

            }
        else if(units>100 && units<=200){
            bill = (units-100)*15 + 100*10;
        }  
          else if(units>200 && units<=300){
            bill = (units-200)*20 + 100*15 + 100*10;
        }   
        else {
            bill = (units-300)*25 + 100*20 + 100*15 + 100*10;
        }

        System.out.println("Bill is " + bill );
    }
}
