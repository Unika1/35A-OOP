package Task.Week2;
import java.util.Scanner;
public class T1 {
    public static void main(String[] args) {
        /*1. Write a program to check whether a person can cast a vote or not. 
        The condition is you must be over 18 years old to vote. */
         Scanner input=new Scanner(System.in);
         System.out.println("Enter your age:");
         int age=input.nextInt();
         if (age>=18) {
            System.out.println("You can cast vote");
         }else;
         System.out.println("You cannnt cast vote");
         input.close();
    }
    

}
