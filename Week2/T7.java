package Task.Week2;
import java.util.Scanner;
public class T7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name:");
        String name=input.nextLine();
        System.out.println("enter your roll no:");
        int roll=input.nextInt();
        System.out.println("enter your field of inetrest:");
        String interest=input.nextLine();
        System.out.println("Hey my name is "+name+" and "+"my roll number is "+roll+". My field of interest are "+ interest);
        input.close();
        /*Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ.
        My field of interest are xyz. */
    }
    
}
