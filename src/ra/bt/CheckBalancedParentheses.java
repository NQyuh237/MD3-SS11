package ra.bt;

import java.util.Stack;
public class CheckBalancedParentheses {public static boolean isBalanced(String input) {
    Stack<Character> stack = new Stack<>();

    for (char c : input.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else if (c == ')' || c == '}' || c == ']') {
            if (stack.isEmpty()) {
                return false;
            }

            char top = stack.pop();
            if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
                return false;
            }
        }
    }

    return stack.isEmpty();
}
    public static void main(String[] args) {
        String input = "({[]})";
        boolean isBalanced = isBalanced(input);

        if (isBalanced) {
            System.out.println("Chuỗi đúng cặp ngoặc.");
        } else {
            System.out.println("Chuỗi không đúng cặp ngoặc.");
        }
    }
}