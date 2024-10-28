import java.util.Scanner;

public class Trafiklys {
    public static void main(String[] args) {
        System.out.print("indtast en farve, rød gul eller grøn");
        Scanner input = new Scanner(System.in);
        String farve = input.nextLine().toLowerCase().trim();
        switch (farve.toLowerCase()) {
            case "rød":
                System.out.println("stop");
                break;
            case "gul":
                System.out.println("vent");
                break;
            case "grøn":
                System.out.println("gå");
                break;
            default:
                System.out.println("Farve findes ikke");
                break;
        }
    }
}