import java.util.Scanner;
class vote{
   public static void main(String[] args)
     {
       int a;
       System.out.print("Enter age :");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       if(a>18){
          System.out.print("The person is eligible to vote");
       }else{
           int el=18-a;
           System.out.print("The person will be eligible in "+el);
       }
  }
}