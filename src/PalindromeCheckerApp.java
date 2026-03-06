import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean iterativeCheck(String input) {

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

    public static boolean recursiveCheck(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return recursiveCheck(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker Application");
        System.out.println("UC13 - Performance Comparison");

        System.out.print("Enter input string: ");
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean iterativeResult = iterativeCheck(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean recursiveResult =
                recursiveCheck(input, 0, input.length() - 1);
        long end2 = System.nanoTime();

        System.out.println("Iterative Result : " + iterativeResult);
        System.out.println("Recursive Result : " + recursiveResult);

        System.out.println("Iterative Time : " + (end1 - start1));
        System.out.println("Recursive Time : " + (end2 - start2));

        sc.close();
    }
}