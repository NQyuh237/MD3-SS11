package ra.bt;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWordsInStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> wordStack = new Stack<>();
        System.out.print("Nhập số lượng các từ: ");
        int numberOfWords = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfWords; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.nextLine();
            wordStack.push(word);
        }
        System.out.println("Các từ theo thứ tự đảo ngược:");
        while (!wordStack.isEmpty()) {
            System.out.println(wordStack.pop());
        }
        scanner.close();
    }
}