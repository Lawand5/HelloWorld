package WhileLoops;

import java.util.Scanner;

public class GrossPayInputValidator {

    //Her er der blevet kodet et program som gør, at chefen kan udregne hans medarbejdsers løn uden overarbejde.

    public static void main (String[] args) {

        //payRate er timelønnen og maxHours er de max antal time medarbejderen kan arbejde uden at det bliver overarbejde.
        int payRate = 15;
        int maxHours = 40;

        //Her starter den med at spørge hvor mange timer medarbejderen har arbejdet
        System.out.println("How many hours did the employee work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        /* Her er der blevet lavet en "While Loop" som validere antallet af timer som max må være 40 Hver gang tallet overstiger 40
        fortæller den at der er forkert og forklare hvordan og hvorledes */
        while(hoursWorked > maxHours) {
            System.out.println("Invalid entry. your hours must be between 1 and " + maxHours + " hours.");
            hoursWorked = scanner.nextDouble();
            //Det er vigtig at hoursworked bliver fortolket som en scannerdouble fordi så kan den udregne med ddecimaltal
        }

        scanner.close();

        double gross = payRate * hoursWorked;
        System.out.println("Gross: $" + gross);

    }
}
