import java.util.Scanner;

public class RectArea {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int upperLeftX;
        int lowerRightY;
        int rectangleArea;

        System.out.println(" Let's find the area of a rectangle");
        System.out.println(" Enter the upper right X coordinate");
        upperLeftX = sc.nextInt();

        System.out.println(" Enter the upper right Y coordinate");
        lowerRightY = sc.nextInt();

        rectangleArea = lowerRightY * upperLeftX;

        System.out.println("The area of your rectangle is: " + rectangleArea);

    }


}
