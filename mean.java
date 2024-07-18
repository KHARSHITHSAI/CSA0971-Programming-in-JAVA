import java.util.Arrays;
import java.util.Scanner;

public class StatisticsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array input from user
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate mean
        double mean = calculateMean(array);
        System.out.println("Mean: " + mean);

        // Calculate median
        double median = calculateMedian(array);
        System.out.println("Median: " + median);

        // Calculate mode
        int mode = calculateMode(array);
        System.out.println("Mode: " + mode);
    }

    private static double calculateMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    private static double calculateMedian(int[] array) {
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            return (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0;
        } else {
            return array[array.length / 2];
        }
    }

    private static int calculateMode(int[] array) {
        Arrays.sort(array);
        int mode = array[0];
        int maxCount = 0;
        int currentNumber = array[0];
        int currentCount = 0;

        for (int num : array) {
            if (num == currentNumber) {
                currentCount++;
            } else {
                currentCount = 1;
                currentNumber = num;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                mode = currentNumber;
            }
        }
        return mode;
    }
}
