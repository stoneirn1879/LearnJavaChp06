import java.util.Scanner;

public class GiveChange {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        float totalPrice = 0;
        float amountGiven = 0;
        float change = 0;


        System.out.println("What is the total price of your purchase?");
        totalPrice = sc.nextFloat();

        System.out.println("How much are you paying?");
        amountGiven = sc.nextFloat();

        change = amountGiven - totalPrice;

        System.out.println("Thank You, your change is: " + change);




        sc.close();
    }

}
