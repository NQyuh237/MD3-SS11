package ra.bt;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPalindrome(input)) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi không phải là Palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {
        input = input.replaceAll("\\s", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        for (char c : input.toCharArray()) {
            queue.offer(c);
        }

        StringBuilder reversedInput = new StringBuilder();
        while (!queue.isEmpty()) {
            reversedInput.append(queue.poll());
        }
        return input.equals(reversedInput.toString());
    }
}
