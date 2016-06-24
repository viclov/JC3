/**
 * Created by VuThang on 6/24/16.
 */
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanln = new Scanner(System.in);
        int year;
        System.out.println("Input a year: ");
        year = scanln.nextInt();
        if ((year%4==0&&year%100!=0)||year%400==0) {
            System.out.println("True");
            return;
        }
        System.out.println("False");
    }
}
