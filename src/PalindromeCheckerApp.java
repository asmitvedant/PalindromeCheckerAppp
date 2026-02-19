import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        // Pop characters to reverse
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (word.equals(reversed)) {
            System.out.println("Palindrome using Stack");
        } else {
            System.out.println("Not Palindrome");
        }

        scanner.close();
    }
}
