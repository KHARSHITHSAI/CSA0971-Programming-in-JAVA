import java.util.Scanner;
class fib{
   public static void main(String[] args)
     {
       int a=0,b=1,c,n;
       System.out.print("Enter the number :");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
           System.out.print("The fibonacci series:  0 1 ");
       while(n>0){
           c=a+b;
           System.out.print(c+" ");
           a=b;
           b=c;
           n--;
        }
      
  }
}