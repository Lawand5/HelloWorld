package inputs;

import java.util.Scanner;

public class TommerBeregner {
    public static void main(String[] args) {
        System.out.println("Dette er en tommeberegner, velkommen til :)");

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Hvor mange tommer vil du beregne?");
        int tommer = scanner.nextInt();
        double cm = tommer*2.54;

        System.out.println (tommer + "tommer er = " + cm + " cm ");
    }
}
