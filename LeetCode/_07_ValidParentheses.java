package LeetCode;

import java.util.*;

public class _07_ValidParentheses {
    public static boolean solution(String s) {
        Stack<Character> characterStack = new Stack<>();

        for (char i : s.toCharArray()) {
            if (i == '(') {
                characterStack.add('(');
            }
            if (i == ')') {
                if (characterStack.size() == 0 || characterStack.peek() != '(') {
                    return false;
                } else {
                    characterStack.pop();
                }
            }
            if (i == '{') {
                characterStack.add('{');
            }
            if (i == '}') {
                if (characterStack.size() == 0 || characterStack.peek() != '{') {
                    return false;
                } else {
                    characterStack.pop();
                }
            }
            if (i == '[') {
                characterStack.add('[');
            }
            if (i == ']') {
                if (characterStack.size() == 0 || characterStack.peek() != '[') {
                    return false;
                } else {
                    characterStack.pop();
                }
            }
        }
        return characterStack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("[{}]"));
    }
}
