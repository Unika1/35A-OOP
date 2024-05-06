package Task.Week3;

import java.util.Scanner;

public class switchq2 {
    public static void main(String[] args) {
          /*Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs
         and performs the corresponding arithmetic operation using a switch case statement. */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        double num1=input.nextDouble();
        System.out.println("Enter second number");
        double num2=input.nextDouble();
        System.out.println("Enter operator (+,-,*,/)");
        char operator=input.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                if (num2!=0) {
                    result=num1/num2;
                }else {
                    System.out.println("Division by zero isnot allowed");
                    return;
                }
                break;        
            default:
                System.out.println("Invalid operator entered");
                return;
        }
        System.out.println("Result "+result);
        input.close();
    }
}
