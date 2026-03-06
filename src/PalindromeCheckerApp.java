import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean checkPalindromeIgnoreCaseAndSpaces(String input) {

        // remove spaces and convert to lowercase
        input = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker Application");
        System.out.println("UC10 - Ignore Case and Spaces");

        System.out.print("Enter input string: ");
        String input = sc.nextLine();

        boolean result = checkPalindromeIgnoreCaseAndSpaces(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}