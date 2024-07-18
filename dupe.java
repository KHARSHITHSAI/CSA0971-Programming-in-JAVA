import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 1};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

    private static int[] removeDuplicates(int[] array) {
        // Sort the array (optional, to group duplicates together)
        Arrays.sort(array);

        // Count unique elements
        int uniqueCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                uniqueCount++;
            }
        }
        uniqueCount++; // for the last element

        // Create a new array with unique elements
        int[] uniqueArray = new int[uniqueCount];
        int index = 0;
        uniqueArray[index++] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueArray[index++] = array[i];
            }
        }

        return uniqueArray;
    }
}
