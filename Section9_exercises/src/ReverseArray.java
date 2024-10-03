import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));

        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
