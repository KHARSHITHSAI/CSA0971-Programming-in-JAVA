import java.util.Scanner;

class rtri {
    
    public static void main(String[] args) {
        int n,m; 
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Print the hollow pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(i==1||i==n||j==1||j==n){
                  System.out.print("* ");
                 }else{
                  System.out.print("  ");
                 }
                  System.out.println();  
            }
}
}
}
