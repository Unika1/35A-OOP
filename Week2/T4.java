package Task.Week2;
import java.util.Scanner;
public class T4 {
    public static void main(String[] args) {
         /* Write the ternary operator for question no. 1*/
         Scanner input=new Scanner(System.in);
         System.out.println("Enter your age");
         int age=input.nextInt();
         // Ternary operaor
         String result=(age>=18) ? "A person can cast a vote"
                                 : "A person cannot cast a vote";
         System.out.println(result);
         input.close();
     }
 }

    

