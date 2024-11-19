import java.util.Arrays;
public class SortableArray {
    // Method to sort an array of integers
    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        return array;
    }

    // Method to sort an array of strings
    public static String[] sortStrings(String[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};
        System.out.println("Sorted Integers: " + Arrays.toString(sortIntegers(numbers)));

        String[] words = {"cat", "fox", "bear", "dog"};
        System.out.println("Sorted Strings: " + Arrays.toString(sortStrings(words)));
    }
}
