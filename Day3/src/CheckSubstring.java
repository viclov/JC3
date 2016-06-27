/**
 * Created by VuThang on 6/25/16.
 */
import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {
        Scanner scanln = new Scanner(System.in);
        String s_1 = "", s_2 = "";
        System.out.print("Nhap chuoi 1: ");
        s_1 = scanln.nextLine();
        System.out.print("Nhap chuoi 2: ");
        s_2 = scanln.nextLine();
        int m = s_1.length(), n = s_2.length();
        int i;
        for (i = 0 ; i < m - n ; i++) {
            if (s_1.substring(i,i+n).equals(s_2)) {
                System.out.print("Chuoi 2 la substring cua chuoi 1");
                return;
            }
        }
        System.out.print("Chuoi 2 khong la substring cua chuoi 1");
    }
}
