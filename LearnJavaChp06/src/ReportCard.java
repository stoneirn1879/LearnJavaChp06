
import java.util.Scanner;

public class ReportCard {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int mathClass;
        int socialStudies;
        int scienceClass;
        int physicalEducation;
        int englishClass;
        int elective;
        int total;

        System.out.println("What are your grades for the semester?");
        System.out.println("Enter as a percent grade");

        System.out.println("What did you get in Math?");
        mathClass = sc.nextInt();

        System.out.println("What did you get in Social Studies?");
        socialStudies = sc.nextInt();

        System.out.println("What did you get in Science?");
        scienceClass = sc.nextInt();

        System.out.println("What did you get in P.E.?");
        physicalEducation = sc.nextInt();

        System.out.println("What did you get in English?");
        englishClass = sc.nextInt();

        System.out.println("What did you get in your elective class?");
        elective = sc.nextInt();

        total = (mathClass + socialStudies + scienceClass + physicalEducation + englishClass + elective) / 6;

        System.out.println("Your Semester Report Card");

        if (total >= 97 && total <= 100) {
            System.out.println("Your Letter Grade is A+");
            System.out.println("Your Percent Grade is 97-100");
            System.out.println("Your Grade Scale is 4.0");
        }

        if (total >= 93 && total <= 96) {
            System.out.println("Your Letter Grade is A");
            System.out.println("Your Percent Grade is 93-96");
            System.out.println("Your Grade Scale is 4.0");
        }

        if (total >= 90 && total <= 92) {
            System.out.println("Your Letter Grade is A-");
            System.out.println("Your Percent Grade is 90-92");
            System.out.println("Your Grade Scale is 3.7");
        }

        if (total >= 87 && total <= 89) {
            System.out.println("Your Letter Grade is B");
            System.out.println("Your Percent Grade is 87-89");
            System.out.println("Your Grade Scale is 3.3");
        }

        if (total >= 83 && total <= 86) {
            System.out.println("Your Letter Grade is B");
            System.out.println("Your Percent Grade is 83-86");
            System.out.println("Your Grade Scale is 3.3");
        }

        if (total >= 80 && total <= 82) {
            System.out.println("Your Letter Grade is B-");
            System.out.println("Your Percent Grade is 80-82");
            System.out.println("Your Grade Scale is 2.7");
        }

        if (total >= 77 && total <= 79) {
            System.out.println("Your Letter Grade is C+");
            System.out.println("Your Percent Grade is 77-79");
            System.out.println("Your Grade Scale is 2.3");
        }

        if (total >= 73 && total <= 76) {
            System.out.println("Your Letter Grade is C");
            System.out.println("Your Percent Grade is 73-76");
            System.out.println("Your Grade Scale is 2.0");
        }

        if (total >= 70 && total <= 72) {
            System.out.println("Your Letter Grade is C-");
            System.out.println("Your Percent Grade is 70-72");
            System.out.println("Your Grade Scale is 1.7");
        }

        if (total >= 67 && total <= 69) {
            System.out.println("Your Letter Grade is D+");
            System.out.println("Your Percent Grade is 67-69");
            System.out.println("Your Grade Scale is 1.3");
        }

        if (total >= 65 && total <= 66) {
            System.out.println("Your Letter Grade is D");
            System.out.println("Your Percent Grade is 65-66");
            System.out.println("Your Grade Scale is 1.0");
        }

        if (total < 65) {
            System.out.println("You Failed the Semester");
            System.out.println("Your Percent Grade is below 65");
            System.out.println("Your Grade Scale is 0.0");
        }

        sc.close();
    }

}
