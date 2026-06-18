package com.rahul;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // Input from user till used doesn't press x or X
        int ans = 0;
        while(true){
            //take operator as input
            System.out.println("Enter operators");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
                System.out.println("Enter two numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(op == '+'){
                    ans = num1+num2;
                }
                if(op == '-'){
                    ans = num1-num2;
                }
                if(op == '*'){
                    ans = num1*num2;
                }
                if(op == '/'){
                    if(num2!=0){
                    ans = num1/num2; } else{ans = -1;}
                }
                if(op == '%') {
                    ans = num1 % num2;
                }

            }
            else if (op == 'x' || op == 'X'){
                break;
            }
            else {
                System.out.println("Invalid");
            }

            System.out.println("Answer = " + ans);

        }



    }
}
