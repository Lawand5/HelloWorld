package inputs;

import java.util.Scanner;

public class GPA {
    public static void main (String[] args) {
        double studentGPA = 3.45;
        String studentFirstName = "Lawand";
        String studentLastName = "Marouf";

        System.out.println( studentFirstName + " " + studentLastName + "Has a GPA of " + studentGPA );
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
    }
}
