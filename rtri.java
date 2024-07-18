import java.util.Scanner;

class rtri {
    
    public static void main(String[] args) {
        int n,k=1; 
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }    }
}
