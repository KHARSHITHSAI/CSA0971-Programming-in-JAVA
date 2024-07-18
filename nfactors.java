import java.util.Scanner;
class nfact {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int count = 0, num;
      System.out.print("Enter a number: ");
      num = sc.nextInt();
      int[] factors = new int[num]; 
      for (int i = 1; i <= num; i++) {
         if (num % i == 0) {
            factors[count] = i;
            count++;
         }
      }
      System.out.println("Number of factors: " + count);
      System.out.print("Enter the value of n: ");
      int n = sc.nextInt();
      if (n <= 0 || n > count) { 
         System.out.println("Invalid input of the value n!!");
      } else {
         System.out.println(n + "th factor of the number " + num + " is: " + factors[n - 1]);
      }
   }
}
