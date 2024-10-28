package inputs;

import java.util.Scanner;

public class CookieBeregner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Hvor mange cookies ønsker du at bage?");
        int cookies = scanner.nextInt();
        double mel = cookies*12.5;

        System.out.println ("Du skal bruge " + mel + " gram mel for at bage " + cookies + " stk cookies");
    }
}
