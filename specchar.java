import java.util.Scanner;
class Spec {
    public static void main(String[] args) {
        System.out.println("Enter any string : ");
        Scanner sc = new Scanner(System.in);
        String statement;
        statement=sc.nextLine(); 
        int specialCharCount = 0;

        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);

            if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9')) {
                specialCharCount++;
            }
        }

              System.out.println("Number of special Characters: " + specialCharCount);
    }
}