import java.util.Arrays;
import java.util.Scanner;
class nthlarg{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int size,large,n;
      System.out.print("Enter the size of the array : ");
      size = sc.nextInt();
      System.out.print("Enter the elements of the array :  ");
      int[] ar = new int[size];
      for(int i=0;i<size;i++){
          ar[i]=sc.nextInt();
      }
      System.out.print("Enter the value of N : ");
      n = sc.nextInt();
      Arrays.sort(ar);
      large=ar[size - n];
      System.out.print(n+"th largest number in the array : "+large);
   }
}
         
      