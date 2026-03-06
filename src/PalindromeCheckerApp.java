

import java.util.Scanner;

public class PalindromeCheckerApp {

    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // ================= UC8 LOGIC =================
    public static boolean checkPalindromeUsingLinkedList(String input) {

        // Convert string to linked list
        Node head = null, tail = null;

        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Fast & Slow pointer to find middle
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        Node curr = slow;

        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // Compare both halves
        Node firstHalf = head;
        Node secondHalf = prev;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // ================= MAIN METHOD =================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker Application");
        System.out.println("1. UC8 - Linked List Based Palindrome Check");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {

            case 1:
                System.out.print("Enter input string: ");
                String input = sc.nextLine();

                boolean result =
                        checkPalindromeUsingLinkedList(input.toLowerCase());

                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + result);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}