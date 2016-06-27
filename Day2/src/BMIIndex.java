/**
 * Created by VuThang on 6/24/16.
 */
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class BMIIndex {
    public static void main(String[] args) {
        Scanner scanln = new Scanner(System.in);
        float weight, height, bmi;
        System.out.println("Input weight and height: ");
        weight = scanln.nextFloat();
        height = scanln.nextFloat();
        bmi = weight/(height*height);
        if (bmi < 18.5) System.out.println("Thieu can");
        else if (bmi<25) System.out.println("Ly tuong");
        else if (bmi<=30) System.out.println("Thua can");
        else System.out.println("Beo phi");
    }

}
