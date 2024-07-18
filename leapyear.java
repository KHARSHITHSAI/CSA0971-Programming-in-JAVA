import java.util.Scanner;
class Leap{
   public static void main(String[] args)
     {
       int a;
       System.out.print("Enter year :");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       if((a%4==0 && a%100!=0)||(a%400==0)){
          System.out.print(a + " is leap year");
       }else{
           System.out.print(a + " is not a leap year");
       }
  }
}