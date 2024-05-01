package Task.Week3;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("enter any number");
       int a=input.nextInt();
       if ((a%5==0) && (a%11==0)) {
        System.out.println("it is divisible by 5 and 11");
       }else{
        System.out.println("it isnot divisible by 5 and 11");
       }input.close();
    }/*  Write a JAVA program to check whether a number is divisible by 5 and 11 or not.*/
}
