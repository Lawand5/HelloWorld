package inputs;

public class ErstatMellemrum {
    public static void main(String[] args) {
        String Line = "i am happy today";
        String erstattatLine = Line.replace(" ", "\uD83D\uDC4F");
        System.out.println(erstattatLine);
    }
}