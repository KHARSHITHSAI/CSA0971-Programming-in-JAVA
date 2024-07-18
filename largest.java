import java.util.Scanner;
class Large{
   public static void main(String[] args)
     {
       int a,b;
       System.out.print("Enter two numbers :");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       b = sc.nextInt();
       if(a>b){
          System.out.print(a + " is the largest among the two numbers");
       }else{
           System.out.print(b + " is the largest among the two numbers");
       }
  }
}