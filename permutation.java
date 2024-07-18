import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Permu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        System.out.println("Enter the number for permutations: ");
        number = sc.nextLine();
        Set<String> permutations = new HashSet<>();
        generatePermutations(number, "", permutations);   
        System.out.println("Unique permutations of " + number + " are:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
    private static void generatePermutations(String str, String prefix, Set<String> permutations) {
        if (str.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String remaining = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(remaining, prefix + str.charAt(i), permutations);
            }
        }
    }
}
