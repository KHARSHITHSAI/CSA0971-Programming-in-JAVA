import java.util.Scanner;
class reverseandadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int steps = 0;
        while (true) {
            int reversedNumber = 0;
            int temp = number;
            while (temp != 0) {
                reversedNumber = reversedNumber * 10 + temp % 10;
                temp /= 10;
            }
            
            number += reversedNumber;
            steps++;
            System.out.println("Step " + steps + ": " + number);
            temp = number;
            reversedNumber = 0;
            while (temp != 0) {
                reversedNumber = reversedNumber * 10 + temp % 10;
                temp /= 10;
            }
            if (number == reversedNumber) {
                break;
            }
        }
               System.out.println("Palindrome: " + number);
    }
}
