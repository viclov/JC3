/**
 * Created by VuThang on 6/25/16.
 */
import java.io.*;

public class Operators {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("So hang 1: ");
        int a = Integer.parseInt(in.readLine());
        System.out.print("So hang 2: ");
        int b = Integer.parseInt(in.readLine());
        System.out.print("Phep tinh: ");
        char c = (char) System.in.read();
        switch(c) {
            case '+': {
                System.out.print("Ket qua: "+(a+b));
                break;
            }
            case '-': {
                System.out.print("Ket qua: "+(a-b));
                break;
            }
            case '*': {
                System.out.print("Ket qua: "+(a*b));
                break;
            }
            case '/': {

                System.out.print("Ket qua: "+(float) a/b);
                break;
            }
        }
    }
}
