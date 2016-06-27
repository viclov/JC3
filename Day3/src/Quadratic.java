/**
 * Created by VuThang on 6/24/16.
 */
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanln = new Scanner(System.in);
        float a, b, c;
        System.out.print("Nhap a = ");
        a = scanln.nextFloat();
        System.out.print("Nhap b = ");
        b = scanln.nextFloat();
        System.out.print("Nhap c = ");
        c = scanln.nextFloat();
        float d = b*b - 4*a*c;
        if (d < 0) {
            System.out.print("Phuong trinh vo nghiem.");
        }
        else if (d ==0) {
            float x = (-b)/(2*a);
            System.out.print("Phuong trinh co nghiem kep x_1=x_2= "+x);
        }
        else {
            float x_1 = (float) (-b + Math.sqrt(d))/(2*a);
            float x_2 = (float) (-b - Math.sqrt(d))/(2*a);
            System.out.print("Phuong trinh co 2 nghiem phan biet\n");
            System.out.print("x_1= "+x_1);
            System.out.print("x_2= "+x_2);
        }
    }

}
