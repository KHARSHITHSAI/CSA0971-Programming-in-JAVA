import java.util.Scanner;
class bintodecoct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String bin = sc.nextLine();
        int dec = Integer.parseInt(bin, 2);
        String oct = Integer.toOctalString(dec);
        System.out.println("Binary: " + bin);
        System.out.println("Decimal: " + dec);
        System.out.println("Octal: " + oct);
    }
}
