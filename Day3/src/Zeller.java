/**
 * Created by VuThang on 6/24/16.
 */
import java.io.*;

public class Zeller {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap vao nam: ");
        int year = Integer.parseInt(in.readLine());
        System.out.print("Nhap vao thang: ");
        int month = Integer.parseInt(in.readLine());
        System.out.print("Nhap vao ngay cua thang: ");
        int q = Integer.parseInt(in.readLine());
        int h, m;
        if(month==1) m = 13;
        else if(month==2) m = 14;
        else m = month;
        int j = year/100;
        int k = year/100;
        h = (q + 26*(m+1)/10+k+k/4+j/4+5*j)%7;
        switch(h) {
            case 0: {
                System.out.print("Ngay cua tuan la Thu 6");
                break;
            }
            case 1: {
                System.out.print("Ngay cua tuan la Thu 7");
                break;
            }
            case 2: {
                System.out.print("Ngay cua tuan la Chu Nhat");
                break;
            }
            case 3: {
                System.out.print("Ngay cua tuan la Thu 2");
                break;
            }
            case 4: {
                System.out.print("Ngay cua tuan la Thu 3");
                break;
            }
            case 5: {
                System.out.print("Ngay cua tuan la Thu 4");
                break;
            }
            case 6: {
                System.out.print("Ngay cua tuan la Thu 5");
                break;
            }
        }
    }
}
