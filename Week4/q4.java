package Task.Week4;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
          /*4. Write a program that reads the width and generates a corresponding square of *.
         For example, if width = 5, output is:
*****
*****
*****
*****
***** */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter width");
        int width=input.nextInt();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
