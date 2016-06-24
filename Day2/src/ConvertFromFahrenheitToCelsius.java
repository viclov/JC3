/**
 * Created by VuThang on 6/24/16.
 */
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class ConvertFromFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanln = new Scanner(System.in);
        int temperature;
        System.out.println("Fahrenheit temperature is: ");
        temperature = scanln.nextInt();
        System.out.println("Celsious temperature is: "+ (temperature-32)/1.8);
    }
}

