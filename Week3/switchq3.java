package Task.Week3;

import java.util.Scanner;

public class switchq3 {
    public static void main(String[] args) {
          /*Write a Java program that takes an integer input (1 to 12) representing a month and
        prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer number (1 to 12) representing a month");
        int month=input.nextInt();
        String season;
        switch (month) {
            case 1:
            case 2:
            case 3:
                season="Winter";
                break;
            case 4:
            case 5:
            case 6:
                season="Spring";
                break;
            case 7:
            case 8:
            case 9:
                season="Summer";
                break;
            case 10:
            case 11:
            case 12:
                season="Fall";
                break;
 
            default:
                System.out.println("Invalid integer");
                return;
        }
        System.out.println(season);
        input.close();
    }
}
