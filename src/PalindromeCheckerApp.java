import java.util.Scanner;

public class PalindromeCheckerApp {

    // Recursive palindrome check
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker Application");
        System.out.println("1. UC9 - Recursive Palindrome Check");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter input string: ");
                String input = sc.nextLine();

                boolean result =
                        isPalindromeRecursive(input.toLowerCase(), 0, input.length() - 1);

                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + result);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}