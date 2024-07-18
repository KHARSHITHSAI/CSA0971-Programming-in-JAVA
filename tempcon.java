import java.util.Scanner;

class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fah,cel,fa,ce;
        System.out.print("Enter temperature in fahrenheit: ");
        fah = sc.nextDouble();
        cel=(fah-32.15)*(5.0/9.0);
        System.out.println("Temp in celcius " + cel);
        System.out.print("Enter temperature in celcius: ");
        ce = sc.nextDouble();
        fa=(ce*(9.0/5.0))+32.15;
        System.out.println("Temp in fahrenheit " + fa);
    }
}
