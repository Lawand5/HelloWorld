package inputs;

import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast dag (1-31): ");
        int date = scanner.nextInt();
        System.out.print("Indtast måned (1-12): ");
        int month = scanner.nextInt();
        if (month == 3 && date >= 21 || month == 4 && date <= 19) {
        System.out.println("Du er en vædder");
        } else if (month == 4 && date >= 20 || month == 5 && date <= 21) {
            System.out.println ("Du er en Tyr)");}
        else if (month == 5 && date >= 22 || month == 6 && date <= 21) {
            System.out.println("Du er en Tvlling)");
        } else if (month == 6 && date >= 22 || month == 7 && date <= 21) {
            System.out.println ("Du er en Krebs");
        } else if (month == 7 && date >= 23 || month == 8 && date <= 22) {
           System.out.println("Du er en Løve");
        } else if (month == 8 && date >= 23 || month == 9 && date <= 22) {
            System.out.println("Du er en Jomfrue");
        } else if (month == 9 && date >= 23 || month == 10 && date <= 22) {
            System.out.println ("Du er en Vægt");
        } else if (month == 10 && date >= 23 || month == 11 && date <= 22) {
            System.out.println("Du er en Skorpion");
        } else if (month == 11 && date >= 23 || month == 12 && date <= 21) {
            System.out.println ("Du er en Skytte");
        }
            }
        }