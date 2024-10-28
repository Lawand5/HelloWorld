package inputs;

import java.util.Scanner;

public class Userinfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvad er dit navn? ");
        String navn = scanner.nextLine();
        System.out.println("Hvad er din yndlingsfarve? ");
        String yndlingsfarve = scanner.nextLine();

        System.out.println(navn + " " + yndlingsfarve);
    }
}
