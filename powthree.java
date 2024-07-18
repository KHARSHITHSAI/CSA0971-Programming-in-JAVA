import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        String result = "false";

        if (n > 0) {
            while (n % 3 == 0) {
                n /= 3;
            }
            if (n == 1) {
                result = "true";
            }
        }

        System.out.println(result);
    }
}