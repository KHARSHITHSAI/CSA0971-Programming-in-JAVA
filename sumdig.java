import java.util.Scanner;
class sum{
  public static void main(String[] args){
    int a,b=0,c,n,r,s=0,or;
    System.out.print("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    c=n;
    while(n!=0){
     a=n%10;
     b=b+a;
     n/=10;
    } 
   System.out.print(b+" is the sum of the digits in the number "+c+"\n"); 
   or=b; 
   while(b!=0){
    r=b%10;
    s=s+r;
    b/=10;
   }
   System.out.print(s+" is the sum of the digits in the number "+or+"\n");  

  }
}
