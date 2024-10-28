import java.util.Arrays;

public class CompareArrays {

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 3, 5};

        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));

        System.out.println(Arrays.equals(array1, array2));
        System.out.println(Arrays.equals(array1, array3));
    }
}
