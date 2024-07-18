import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c,d,e;
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        d=a/b;
        e=a%b;
        System.out.println("The sum of two numbers: " + c);
        System.out.println("The Quotient : " + d);
        System.out.println("The Remainder : " + e);
    }
}
