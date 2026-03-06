import java.util.Scanner;

public class PalindromeCheckerApp {

    static class PalindromeService {

        public boolean isPalindrome(String input) {

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
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker Application");
        System.out.println("UC11 - OOP Palindrome Service");

        System.out.print("Enter input string: ");
        String input = sc.nextLine();

        PalindromeService service = new PalindromeService();

        boolean result = service.isPalindrome(input.toLowerCase());

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}