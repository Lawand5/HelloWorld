import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Opretter en Scanner for at få input fra brugeren
        Scanner scanner = new Scanner(System.in);

        // Beder brugeren om et tal
        System.out.print("Indtast et tal: ");
        int antalRaekker = scanner.nextInt();

        // Laver pyramiden med loops
        for (int i = 1; i <= antalRaekker; i++) {
            // Udskriver stjerner i hver række
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Går til næste linje efter hver række
            System.out.println();
        }

        // Lukker scanneren
        scanner.close();
    }
}
