package Opgave1;

public class Opgave2_1 {

    //Ogave hvor vi skal skrive en metode som gør vi kan printe "2 gange 1 = 2" osv.

     public static void main(String[] args) {
         int tal = 2;  // Dette er talet som der skal ganges med hele vejen igennem

         for (int i = 1; i <= 4; i++) {  // For-loop, som er fra 1 til 4 "i++" betyder at i forstørres med en hver gang,
             int resultat = tal * i;  // Beregner produktet
             System.out.println(tal + " gange " + i + " = " + resultat);  // Udskriver resultatet
         }
     }
 }