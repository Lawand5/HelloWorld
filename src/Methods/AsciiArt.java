package Methods;

import java.util.Scanner;

public class AsciiArt {
    public static void Art() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("indsæt et tal: ");
        int row = scanner.nextInt();
        for (int i = row; i >= 1; i--) { // row og 1 er blevet byttet om på for at ændre den til at tælle ned i stjerner også er det 1--
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
System.out.println();
            }
    }
    public static void main(String[] args) {
        Art();
    }
}