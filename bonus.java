import java.util.Scanner;

class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade of the employee (A or B): ");
        String gra = scanner.nextLine().toUpperCase();
        
        System.out.print("Enter the employee salary: ");
        double sal = scanner.nextDouble();

        double bonsPer;
        double addBonus = 0.0;

        if (gra.equals("A")) {
            bonsPer = 0.05;
        } else if (gra.equals("B")) {
            bonsPer = 0.10; 
        } else {
            System.out.println("Invalid grade entered. Please enter A or B.");
            return;
        }

        if (sal < 10000) {
            addBonus = 0.02 * sal; 
        }

        double bonus = (bonsPer * sal) + addBonus;
        double totSal = sal + bonus;

        System.out.println("Salary=" + sal);
        System.out.println("Bonus=" + bonus);
        System.out.println("Total to be paid:" + totSal);

           }
}