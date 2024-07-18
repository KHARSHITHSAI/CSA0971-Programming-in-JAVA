import java.util.Scanner;
class oddeve{
   public static void main(String[] args)
     {
       int a;
       System.out.print("Enter any number:");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       if(a%2==0){
          System.out.print(a+"is even number");
       }else{
           System.out.print(a+"is odd number");
       }
  }
}