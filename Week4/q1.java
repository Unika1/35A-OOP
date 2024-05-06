package Task.Week4;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter you name");
        String name=input.nextLine();
        for(int index=0;index<5;index++){
            System.out.println("Hello my name is "+name);
        }
    }
    
}
