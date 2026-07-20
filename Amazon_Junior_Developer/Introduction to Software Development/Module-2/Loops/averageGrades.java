import java.util.*;
public class averageGrades {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first subject marks");
        double marksSubject1 = keyboard.nextDouble();
        System.out.println("Enter 2nd subject marks");
        double marksSubject2 = keyboard.nextDouble();
        System.out.println("Enter 3rd subject marks");
        double marksSubject3 = keyboard.nextDouble();

        double average = (double)(marksSubject1+marksSubject2+marksSubject3)/3;

        if(average>=60 &&average<=69){System.out.println("Below Average");}
        else if(average>=70 &&average<=79){System.out.println("Average");}
        else if(average>=80 &&average<=89){System.out.println("Good");}
        else if(average>=90 &&average<=100){System.out.println("Excellet");}
        else{System.out.println("Failed");}
    }
}
