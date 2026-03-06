import java.util.Scanner;

public class PalindromeCheckerApp {

    // Recursive palindrome check
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker Application");
        System.out.println("UC9 - Recursive Palindrome Check");

        System.out.print("Enter input string: ");
        String input = sc.nextLine();

        boolean result = isPalindromeRecursive(
                input.toLowerCase(),
                0,
                input.length() - 1
        );

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}