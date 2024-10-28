public class Swap {
    public static void main(String[] args) {
        int[] tal = {11, 42, 27, 0, 89};

        swap(tal, 1, 3);

        System.out.println("Array swap:");
        printswap(tal);
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void printswap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}