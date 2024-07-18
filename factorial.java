import java.util.Scanner;
class fact{
   public static void main(String[] args)
     {
       int a,fac=1;
       System.out.print("Enter the number :");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       for(int i=1;i<=a;i++){
           fac=fac*i;
        }
         System.out.print("The factorial of "+a+" is "+fac);       
  }
}