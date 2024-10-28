public class Testtt {

    public static void main(String[] args) {

        // 1. Lav et tomt array som kan indeholde 8 elementer af typen int.
        int[] intArray = new int[8];

        // Assign værdien 34 på den første plads og 117 på den sidste plads i arrayet.
        intArray[0] = 34;
        intArray[7] = 117;

        // 2. For-loop der itererer over arrayet og udskriver alle værdierne.
        System.out.println("Int array værdier:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        // Hvad udskrives?
        // Det udskriver: 34, 0, 0, 0, 0, 0, 0, 117.

        // 3. Lav et array med Strings, som er 3 elementer langt og indeholder ”Hej”, ”med” og ”dig”.
        String[] stringArray = {"Hej", "med", "dig"};

        // For each-loop der itererer over arrayet og udskriver de tre Strings med mellemrum imellem.
        System.out.println("\nString array værdier:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();  // Ny linje til sidst.

        // 4. Lav et array med doubles som indeholder værdierne 3.4, 2.5, 1.2, 6.7.
        double[] doubleArray = {3.4, 2.5, 1.2, 6.7};

        // Udskriv den værdi der står på index 2.
        System.out.println("\nDouble array værdi på index 2: " + doubleArray[2]);

        // Udskriv længden på arrayet.
        System.out.println("Længden på double arrayet: " + doubleArray.length);

        // Hvad sker der, hvis du forsøger at udskrive en værdi på index 4?
        // Det vil kaste en ArrayIndexOutOfBoundsException, da index 4 er uden for arrayets grænser.
        try {
            System.out.println(doubleArray[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fejl: Forsøgte at tilgå index 4, som er uden for arrayets grænser.");
        }
    }
}
