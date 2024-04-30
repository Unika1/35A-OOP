package Task.Week2;
import java.util.Scanner;
public class T10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the marks of science");
        int science=input.nextInt();
        System.out.println("enter the marks of maths");
        int maths=input.nextInt();
        System.out.println("enter the marks of english");
        int Eng=input.nextInt();
        System.out.println("enter the marks of nepali");
        int nepali=input.nextInt();
        int total=(science+maths+Eng+nepali);
        System.out.println(total);
        int per=(total/400)*100;
        System.out.println(per);
        if (per>=70) {
            System.out.println("First class");
        }else if ((per>59)&&(per<70)) {
            System.out.println("upper Second class");
        }else if ((per>=49)&&(per<=59)) {
            System.out.println("Second class");
        }else if ((per>=39)) {
            System.out.println("Third class");
        }else{
            System.out.println("Fail");
    }/*10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

a. If equal to or more than 70 -> First Class

b. If more than 59 -> Upper Second Class

c. If more than 49 -> Second class

d. If more than 39 -> Third class and if below than 40 the result is fail. 

Hint: Use ternary operator */
}
}
