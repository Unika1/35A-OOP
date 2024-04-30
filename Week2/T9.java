package Task.Week2;
import java.util.Scanner;
public class T9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int lenght=input.nextInt();
        System.out.println("enter the breath of rectangle");
        int breath=input.nextInt();
        int result=lenght*breath;
        System.out.println("the area of rectangle is "+result);
        input.close();
        /*Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */

    }
}
