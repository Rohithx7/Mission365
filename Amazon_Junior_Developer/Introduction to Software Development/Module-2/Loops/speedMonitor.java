import java.util.*;
public class speedMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // takes input
        System.out.println("Enter Current Speed : ");
        int speed = sc.nextInt(); // taking speed input
        
        if(speed >= 65 && speed<=79){System.out.println("5th gear");}
        else if( speed >=0 && speed<=16){System.out.println("1st gear");} // 1st gear
        else if( speed >= 17 && speed <=32){System.out.println("2nd gear");} // 2nd gear
        else if(speed >=33 && speed<=48 ){System.out.println("3rd gear");} // 3rd gear 
        else if( speed >=49 && speed <= 64){System.out.println("4th gear");} //4th gear
        else{
          System.out.println("Slow Down Boss");//high speed 
        }


        sc.close();// scanner closed

    }
}
