package Task.Week3;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter any year");
        int a=input.nextInt();
        if ((a%4==0)){
            if ((a%100!=0)||(a%400==0)) {   
                System.out.println("the year is leap year");
        }else{
            System.out.println("the year is not leap year");
            }
        }input.close();
    }/*Write a JAVA program to check whether a year is a leap year or not. 

Hint: if year%4==0; if year%100!==0 ; year%400==0;  */
}
