import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p,t;
        System.out.print("Enter two numbers : ");
        p = sc.nextDouble();
        t = sc.nextDouble();
        System.out.println("Before swapping \n First and second numbers are " + p + t);
        p=p+t;
        t=p-t;
        p=p-t;
        System.out.println("After swapping \n First and second numbers are " + p + t);
    }
}
