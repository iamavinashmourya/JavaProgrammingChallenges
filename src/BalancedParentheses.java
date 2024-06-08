/* Write a Java program to check if a given string of parentheses is balanced. */

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "((()))";
        System.out.println(isBalanced(input));

        input = "(()))";
        System.out.println(isBalanced(input));
    }
}
