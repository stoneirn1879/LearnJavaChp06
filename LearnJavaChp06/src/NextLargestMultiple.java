import java.util.Scanner;

public class NextLargestMultiple {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        int j = 0;

        int nextMultiple = 0;

        System.out.println("Enter a number: ");
        i = sc.nextInt();
        System.out.println("Enter another number: ");
        j = sc.nextInt();

        nextMultiple = (i + j) - (i % j);

        System.out.println(" The new number is: " + nextMultiple);

        sc.close();
    }

}
