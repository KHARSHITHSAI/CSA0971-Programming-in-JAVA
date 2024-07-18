import java.util.Scanner;
import java.util.Arrays;

public class sqnext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower range: ");
        int lowerRange = scanner.nextInt();
        
        System.out.print("Enter the upper range: ");
        int upperRange = scanner.nextInt();
        
        scanner.close();
        
        int[][] resultArray = new int[upperRange - lowerRange + 1][2];
        
        for (int i = lowerRange; i <= upperRange; i++) {
            resultArray[i - lowerRange][0] = i;
            resultArray[i - lowerRange][1] = i * i;
        }
        
        System.out.print("Output: ");
        System.out.print("[");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print("(" + resultArray[i][0] + ", " + resultArray[i][1] + ")");
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
