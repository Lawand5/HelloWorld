package Methods;

import java.util.Scanner;

public class  AsciiArt2 {
    public static void Art() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("indsæt et tal: ");
        int row = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(i); //Man ændrer * til i så det bliver til tal
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Art();
    }
}