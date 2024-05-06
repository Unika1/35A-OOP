package Task.Week3;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        /*Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char ch=input.next().charAt(0);;
        if (ch=='a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
    }
}
 

