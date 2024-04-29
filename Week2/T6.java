package Task.Week2;
import java.util.Scanner;
public class T6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st integer");
        int num1=input.nextInt();
        System.out.println("enter 2nd integer");
        int num2=input.nextInt();
        int sum=num1+num2;
        int product=num1*num2;
        System.out.println("The divison of sum by the product is:"+(sum/product));
        input.close();
        /*Take two integer inputs from the user. First, calculate the sum of two, then the product of two.
        Finally, calculate the division of the thus obtained sum and product and print the result. */
    }
    }
    

