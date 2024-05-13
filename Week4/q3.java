package Task.Week4;

public class q3 {
    public static void main(String[] args) {
                /*3. Write a program that generates the following table:
        Number    Square
        10    100
        9    81
        ..    ….2    4
        1    1 */
                System.out.println("Number\tSquare");
                for (int num=10; num>=1; num--) {
                    int Square=num*num;
                    System.out.println(num+"    "+Square);
                }
    }
}
