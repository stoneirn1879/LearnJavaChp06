import java.util.Scanner;

public class DailyRainfall {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        float mondayRainfall = 0;
        float tuesdayRainfall = 0;
        float wednesdayRainfall = 0;
        float thursdayRainfall = 0;
        float fridayRainfall = 0;
        float saturdayRainfall = 0;
        float sundayRainfall = 0;
        float weeklyRainfall = 0;
        float weeklyAverageRainfall = 0;

        System.out.println("Enter the rainfall total for Monday in inches");
        mondayRainfall = sc.nextFloat();

        System.out.println("Enter the rainfall total for Tuesday in inches");
        tuesdayRainfall = sc.nextFloat();

        System.out.println("Enter the rainfall total for Wednesday in inches");
        wednesdayRainfall = sc.nextFloat();

        System.out.println("Enter the rainfall total for Thursday in inches");
        thursdayRainfall = sc.nextFloat();

        System.out.println("Enter the rainfall total for Friday in inches");
        fridayRainfall = sc.nextFloat();

        System.out.println("Enter the rainfall total for Saturday in inches");
        saturdayRainfall = sc.nextFloat();

        System.out.println("Enter the rainfall total for Sunday in inches");
        sundayRainfall = sc.nextFloat();

        weeklyRainfall = mondayRainfall + tuesdayRainfall + wednesdayRainfall + thursdayRainfall + fridayRainfall +
                saturdayRainfall + sundayRainfall;
        weeklyAverageRainfall = (mondayRainfall + tuesdayRainfall + wednesdayRainfall + thursdayRainfall + fridayRainfall +
                saturdayRainfall + sundayRainfall) / 7;

        System.out.println("The rainfall total for the week is as follows: ");
        System.out.println("\t Monday's total rainfall was: " + mondayRainfall + " " + "inces.");
        System.out.println("\t Tuesdays's total rainfall was: " + tuesdayRainfall + " " + "inces.");
        System.out.println("\t Wednesday's total rainfall was: " + wednesdayRainfall + " " + "inces.");
        System.out.println("\t Thursday's total rainfall was: " + thursdayRainfall + " " + "inces.");
        System.out.println("\t Friday's total rainfall was: " + fridayRainfall + " " + "inces.");
        System.out.println("\t Saturday's total rainfall was: " + saturdayRainfall + " " + "inces.");
        System.out.println("\t Sunday's total rainfall was: " + sundayRainfall + " " + "inces.");
        System.out.println("----------------------------------------------------");
        System.out.println("\t The total for the week was: " + weeklyRainfall + " " + "inces.");
        System.out.println("\t The average for the week was: " + weeklyAverageRainfall + " " + "inces.");


        sc.close();
    }

}
