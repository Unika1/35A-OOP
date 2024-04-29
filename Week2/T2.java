package Task.Week2;
import java.util.Scanner;
public class T2 {
    /*Write a program to calculate SI. 

Formula Simple Interest = (PrincipleAmount*Time*Rate/100); 
*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    System.out.println("enter principle");
    int principle=input.nextInt();
    System.out.println("enter time");
    int time=input.nextInt();
    System.out.println("enter rate");
    int rate=input.nextInt();
    System.out.println("simple interest="+(principle*+time*+rate)/100);
    input.close();
}

}
