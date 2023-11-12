package validParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        String open = "({[";
        String close = ")}]";
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (open.contains(String.valueOf(c))) {
                stack.push(c);
            } else if (close.contains(String.valueOf(c))) {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
