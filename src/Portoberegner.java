import java.util.Scanner;

public class Portoberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pris = 0;
        System.out.print("Hvor mange gram vejer dit brev?");
        double vægt = input.nextDouble();


        if (vægt <= 0 || vægt > 2000) {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
            System.exit(0);
        } else if ( vægt <= 100 ) {
            pris = 25 ;}
        else if ( vægt <= 250) {
            pris = 50 ;
        } else if (vægt <= 2000) {
            pris = 75 ;
        }
        System.out.println ("Din pris på brevet er : " + pris + "kr");
    }
}