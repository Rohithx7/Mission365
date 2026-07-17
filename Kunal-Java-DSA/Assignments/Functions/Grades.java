
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int marks = sc.nextInt();

        grader(marks);
    }
    static void grader(int marks){
        int m = marks;
        if(m>=91 && m<100){System.out.println("AA");}
        else if(m>=81 && m<90){System.out.println("BB");}
        else if(m>=71 && m<80){System.out.println("CC");}
        else if(m>=61 && m<70){System.out.println("BC");}
        else if(m>=51 && m<60){System.out.println("CD");}
        else if(m>=41 && m<50){System.out.println("DD");}
        else{System.out.println("Fail");}
       

    }
}
