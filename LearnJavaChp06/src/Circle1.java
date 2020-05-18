import java.util.Scanner;

public class Circle1 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        // Circumference = 2*pi*radius

        float circumference = 0f;
        float pi = 3.14159f;
        float radius = 0;

        System.out.println("Enter the radius of your circle: ");
        radius = sc.nextFloat();

        circumference = 2 * pi * radius;

        System.out.println(" The Circumference of your circle is:  " + circumference);
        System.out.println(" The Radius of your ciccle is: " + radius);

        sc.close();

    }


}
