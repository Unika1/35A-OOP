package Task.Week2;
import java.util.Scanner;
public class T5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st integer");
        int num1=input.nextInt();
        System.out.println("enter 2nd integer");
        int num2=input.nextInt();
        System.out.println("the sum of two num is="+(num1+num2));
        System.out.println("the product of number="+(num1*num2));
        input.close();
        /*Write a program to take two integer inputs from the user and print the sum and product of them. */
    }
    
}
