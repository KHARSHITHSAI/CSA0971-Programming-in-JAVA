import java.util.Scanner;

class simp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p,t,r,i;
        System.out.print("Enter principle amount, time tenure and rate of interest(in percentage) : ");
        p = sc.nextDouble();
        t = sc.nextDouble();
        r = sc.nextDouble();
        i=(p*t*r)/100;
        System.out.println("Simple interest " + i);
    }
}
