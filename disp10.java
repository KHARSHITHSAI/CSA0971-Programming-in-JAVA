import java.util.Scanner;
class disp10{
   public static void main(String[] args)
     {
       int a;
       System.out.print("Enter the limit :");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       for(int i=0;i<=a;i++){
         System.out.print(i+"\t");
        }
  }
}