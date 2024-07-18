import java.util.Arrays;
import java.util.Scanner;

 class asna {i
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine();  
        String[] nam = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            nam[i] = sc.nextLine();
        }
        Arrays.sort(nam);
        System.out.println("Names in ascending order:");
        for (String name : nam) {
            System.out.println(name);
        }
    }
}