import java.util.Scanner;
class sumser{
   public static void main(String[] args)
     {
       int a,sum=0;
       System.out.print("Enter the limit :");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       for(int i=1;i<=a;i++){
           sum=sum+i;
        }
         System.out.print("The sum of the numbers from 1 to "+a+" is "+sum);       
  }
}