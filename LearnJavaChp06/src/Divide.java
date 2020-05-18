import java.util.Scanner;

public class Divide {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int numberOne = 0;
        int numberTwo = 0;
        int quotient = 0;


        System.out.println("Enter your first number: ");
        numberOne = sc.nextInt();
        System.out.println("Enter your second number: ");
        numberTwo = sc.nextInt();

        quotient = numberOne / numberTwo;
        // 0 throws an exception and non divisible number answers with as many numbers are divisible. use a floating
        //point calculation for an accurate remainder.

        System.out.println("The quotient of " + numberOne + " " + "and " + numberTwo + " " + "equals: " + quotient);

        sc.close();
    }

}
