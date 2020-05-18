import java.util.Scanner;

public class CalculateTip {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        float bill = 0f;
        float tip = 0f;
        float tipAmount = 0;
        float totalAmount = 0;

        System.out.println("Enter the total amount of your bill in $: ");
        bill = sc.nextFloat();

        System.out.println("How much tip would you like to leave?  15%, 18%, 20% ");
        System.out.println("Enter .15 for 15%, .18 for 18%, or .20 for 20%");
        tip = sc.nextFloat();

        tipAmount = (tip * bill);
        totalAmount = tipAmount + bill;

        if (tip > .20 ) {
            System.err.println("Please enter tip as a decimal. ie .15 for 15%");
        }
        else

        System.out.println("Your total amount is: " + totalAmount);

        sc.close();
    }

}
