package Task.Week3;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        int a=input.nextInt();
        System.out.println("enter 2nd number");
        int b=input.nextInt();
        System.out.println("enter 3rd number");
        int c=input.nextInt();
        if ((a>b) && (a>c)) {
            System.out.println("a is greater");
        }else if ((b>c) && (b>a)) {
            System.out.println("b is greater");
        }else if ((c>a)&&(c>b)) {
            System.out.println("c is greater");
            input.close();
        }
        /*1. Write a JAVA program to find the maximum between three numbers. */
    }
    
}
