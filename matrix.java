import java.util.Scanner;

class matop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (nXn): ");
        n = sc.nextInt();
        Integer[][] m1 = new Integer[n][n];
        System.out.println("Enter the elements of matrix 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        Integer[][] m2 = new Integer[n][n];
        System.out.println("Enter the elements of matrix 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        Integer[][] m3 = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m3[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        Integer[][] m4 = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m4[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m4[i][j] = m1[i][j] * m2[i][j];
            }
        }
        Integer[][] m5 = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m5[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m5[i][j] = m1[i][j] - m2[i][j];
            }
        }
        System.out.println("The Added matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m3[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("The Multiplied matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m4[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("The Substracted matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m5[i][j] + "   ");
            }
            System.out.println();
        }
        
    }
}
