package Task.Week3;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int a=input.nextInt();
        if (a<0)  {
            System.out.println("is negative");
        }else if (a>0) {
            System.out.println("is positive");
        }else{
            System.out.println("number is zero");
        }input.close();
            
        }/*Write a JAVA program to check whether a number is negative, positive, or zero. */
    }
    

