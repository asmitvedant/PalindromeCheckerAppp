public class PalindromeCheckerApp {

    public static boolean normalCheck(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static boolean recursiveCheck(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursiveCheck(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "racecar";

        long start1 = System.nanoTime();
        boolean result1 = normalCheck(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = recursiveCheck(input, 0, input.length() - 1);
        long end2 = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Normal Result : " + result1);
        System.out.println("Recursive Result : " + result2);

        System.out.println("Normal Time (ns): " + (end1 - start1));
        System.out.println("Recursive Time (ns): " + (end2 - start2));
    }
}