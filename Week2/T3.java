package Task.Week2;
import java.util.Scanner;
public class T3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
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
    }
}
/*3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */