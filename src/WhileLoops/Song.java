package WhileLoops;

import java.util.Scanner;

public class Song {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("PLaying current song");
            System.out.println("Would you like to take this song " + "off of repeat? if so, answer yes");
            String input = scanner.next();
            if ("yes".equals(input)) {
                isOnRepeat = false;
            }
        }
        System.out.println("PLaying next song");
    }
}
