import java.util.Scanner;

public class FahrToCels {

    public static void main(String [] args) {

    // (32°F − 32) × 5/9 = 0°C
    // (100°F − 32) × 5/9 = 37.778°C

        Scanner sc = new Scanner(System.in);

        float fahrenheit = 0f;
        float celsius = 0f;

        System.out.println("Enter the current temperature in Fahrenheit: ");
        fahrenheit = sc.nextFloat();

        celsius = ((fahrenheit - 32) * 5/9);

        System.out.println("The temperature in Celsius is: " + celsius);

        sc.close();
    }

}
