import java.util.Stack;
import java.util.HashMap;

public class Main {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> bracketsMap = new HashMap<Character, Character>();
        bracketsMap.put(')', '(');
        bracketsMap.put(']', '[');
        bracketsMap.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            if (bracketsMap.containsValue(s.charAt(i))) {
                stack.add(s.charAt(i));
            } else if (bracketsMap.containsKey(s.charAt(i))) {
                if (stack.isEmpty() || stack.pop() != bracketsMap.get(s.charAt(i))) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("020 - Valid Parentheses");

        String example1 = "()";
        System.out.println(isValid(example1));
        String example2 = "()[]{}";
        System.out.println(isValid(example2));
        String example3 = "(]";
        System.out.println(isValid(example3));
    }
}