import java.util.Scanner;

class SimpleCalci{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st number : ");
        int number1 = sc.nextInt();
         System.out.println("Please enter 2nd number : ");
        int number2 = sc.nextInt();
        System.out.println("Enter Operand : ");
        char operand = sc.next().charAt(0);

        if(operand == '+'){System.out.println(number1+number2);}
        else if(operand == '-'){System.out.println(number1-number2);}
        else if(operand == '*'){System.out.println(number1*number2);}
        else if(operand == '/'){System.out.println(number1/number2);}
        else{System.out.println("Invalid Operator");}


    }

}