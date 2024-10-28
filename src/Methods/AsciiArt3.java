package Methods;

import java.util.Scanner;

public class  AsciiArt3 {
    public static void Art() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("indsæt et tal: ");
        int row = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
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