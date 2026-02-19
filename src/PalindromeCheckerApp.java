import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        String reversed = "";

        // Reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // ✅ i not 1
        }

        // Check palindrome
        if (original.equals(reversed)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        scanner.close();
    }
}
