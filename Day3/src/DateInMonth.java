/**
 * Created by VuThang on 6/24/16.
 */
import java.util.Scanner;

public interface DateInMonth {
    public static void main(String[] args) {
        Scanner scanln = new Scanner(System.in);
        int year, month, date;
        System.out.print("Nhap vao nam: ");
        year = scanln.nextInt();
        System.out.print("Nhap vao thang: ");
        month = scanln.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                date = 31;
                System.out.print("Thang "+ month +" nam "+ year +" co "+ date +" ngay");
                break;
            }
            case 2: {
                if((year%4==0 && year%100!=0) || year%400==0) date = 29;
                else date =28;
                System.out.print("Thang "+ month +" nam "+ year +" co "+ date +" ngay");
                break;
            }

            case 4:
            case 6:
            case 9:
            case 11: {
                date = 30;
                System.out.print("Thang "+ month +" nam "+ year +" co "+ date +" ngay");
                break;
            }
        }
    }
}
