package Task.Week3;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter any number");
        int a=input.nextInt();
        if (a%2==0) {
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }input.close();
    }/*Write a JAVA program to check whether a number is even or odd. */
}
