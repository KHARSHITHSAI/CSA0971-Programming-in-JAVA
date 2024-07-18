import java.util.Scanner;
class multiply{
   public static void main(String[] args)
     {
       int a;
       System.out.print("Enter the number for table :");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       for(int i=1;i<=10;i++){
         System.out.print(a+" X "+i+" = "+a*i+"\n");
        }
  }
}