
import java.util.Scanner;

class MaxMinMethods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int max = max(n1,n2,n3);
        System.out.println("Maxiumum is "+max);
        int min = min(n1,n2,n3);
        System.out.println("Minimum of "+min);
    }
    static int max(int n1, int n2, int n3){
        int max = n1;
        if(n2>n3 && n2>n1){max = n2;}
        else if(n3>n2 && n3>n1){max=n3;}

        return max;}
    static int min(int n1, int n2, int n3){
        
         int min = n1;
        if(n1>n2 && n3>n2){min = n2;}
        else if(n2>n3&& n1>n3){min=n3;}
        
        return min;}
}