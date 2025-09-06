import java.util.*;
public class BalancedParenthesesChecker {
    public static void main(String[] args) {
        String s = "{[()]}";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if ("({[".indexOf(c) >= 0) stack.push(c);
            else if (!stack.isEmpty() && 
                ((c == ')' && stack.peek() == '(') || 
                 (c == '}' && stack.peek() == '{') || 
                 (c == ']' && stack.peek() == '[')))
                stack.pop();
            else {
                System.out.println("Not Balanced");
                return;
            }
        }
        System.out.println(stack.isEmpty() ? "Balanced" : "Not Balanced");
    }
}