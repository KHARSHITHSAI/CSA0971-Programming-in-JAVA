import java.util.Scanner;
class TrianglePatterns {
    
    public static void main(String[] args) {
        int n; 
        System.out.println("Enter the no.of rows : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Right Triangle:");
        printRightTriangle(n);
        
        System.out.println("\nLeft Triangle:");
        printLeftTriangle(n);
        
        System.out.println("\nPyramid:");
        printPyramid(n);
        
        System.out.println("\nInverted Right Triangle:");
        printInvertedRightTriangle(n);
        
        System.out.println("\nInverted Left Triangle:");
        printInvertedLeftTriangle(n);
        
        System.out.println("\nInverted Pyramid:");
        printInvertedPyramid(n);
    }

    public static void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printLeftTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printInvertedRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printInvertedLeftTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printInvertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
