public class CompareArrays2 {

    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 3};

        if (compareArrays(array1, array2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (compareArrays(array1, array3)) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
