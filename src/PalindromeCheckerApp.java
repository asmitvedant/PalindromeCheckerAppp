import java.util.Scanner;

public class PalindromeCheckerApp {

    interface PalindromeStrategy {
        boolean check(String input);
    }

    static class SimpleStrategy implements PalindromeStrategy {

        public boolean check(String input) {

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

    static class PalindromeContext {

        private PalindromeStrategy strategy;

        public PalindromeContext(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String input) {
            return strategy.check(input);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker Application");
        System.out.println("UC12 - Strategy Pattern");

        System.out.print("Enter input string: ");
        String input = sc.nextLine();

        PalindromeContext context =
                new PalindromeContext(new SimpleStrategy());

        boolean result = context.execute(input.toLowerCase());

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}