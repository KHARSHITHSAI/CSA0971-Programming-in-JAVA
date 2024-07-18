import java.util.Scanner;
class arms{
  public static void main(String[] args){
    int a,b=0,c,n;
    System.out.print("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    c=n;
    while(n!=0){
     a=n%10;
     b=b+(a*a*a);
     n/=10;
    } 
    if(c==b){
      System.out.println("\n"+c+" is an armstrong number");
    }else{
      System.out.println(c+" is not an armstrong");
    }
  }
}
