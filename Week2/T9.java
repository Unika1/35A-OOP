package Task.Week2;
import java.util.Scanner;
public class T9 {
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
    }
}
}
