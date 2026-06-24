import java.util.Scanner;
class EvenOdd{

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number to check Even or Odd = ");
    int in = sc.nextInt();
    sc.close();

    if(in%2 == 0){
        System.out.println(in + " is Even number.");
    }
    else{
        System.out.println(in + " is Odd number.");
    }







}

}