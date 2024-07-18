import java.util.Scanner;
class pernum{
  public static void main(String[] args){
    int a,b=0,c,n,s=0;
    System.out.print("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    c=n;
    System.out.print("the factors : ");
    for(int i=1;i<=n;i++){
     if(n%i==0){
       System.out.print(i+" ");
     }
    }
    for(int i=1;i<n;i++){
     if(n%i==0){
       s=(s+i);
     }
    }
    System.out.print("\nThe sum of the factors of the number "+n+" is : "+s+"\n");
    if(c==s){
      System.out.println("\n"+c+" is a perfect number");
    }else{
      System.out.println("\n"+c+" is not a perfect number");
    }

  }
}
