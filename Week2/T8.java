package Task.Week2;
import java.util.Scanner;
public class T8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the side of square");
        int side1=input.nextInt();
        System.out.println("the perimeter of square is"+(4*(side1*side1)));
        System.out.println("area of square is"+(side1*side1));
        System.out.println("enter principle");
        int principle=input.nextInt();
        System.out.println("enter time");
        int time=input.nextInt();
        System.out.println("enter rate");
        int rate=input.nextInt();
        System.out.println("simple interest="+(principle*+time*+rate)/100);
        System.out.println("enter the base of triangle");
        int base=input.nextInt();
        System.out.println("enter the height of");
        int height=input.nextInt();
        System.out.println("area of triangle="+(base*height)/2);
        int length=input.nextInt();
        System.out.println("enter the length of cuboid");
        int width =input.nextInt();
        System.out.println("enter width");
        System.out.println("volume of cubiod"+(length*height*width));
        System.out.println("enter the side of cube");
        int side=input.nextInt();
        System.out.println("the volume of cube"+(side*side*side));
        input.close();
        /*Take side of a square from user and print area and perimeter of it. 
        Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
        Take the attributes as user input. */
    }
    
}
