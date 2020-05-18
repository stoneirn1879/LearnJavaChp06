import java.util.Scanner;

public class Circle2 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        // Circumference = 2*pi*radius
        // Area = pi *radius squared

        float circumference = 0f;
        float pi = 3.14159f;
        float radius = 0f;
        float area = 0f;

        System.out.println("Enter the radius of your circle: ");
        radius = sc.nextFloat();

        circumference = 2 * pi * radius;
        area = pi * (radius * 2);

        System.out.println(" The Circumference of your circle is:  " + circumference);
        System.out.println(" The Radius of your circle is: " + radius);
        System.out.println(" The Area of your circle is: " + area);

        sc.close();

    }


}
