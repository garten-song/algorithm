package practice.level2.p12973;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        int test = solution("baabaa");
        System.out.println(test);
    }

    static public int solution(String s) {
        char[] carr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < carr.length; i++) {
            char c = carr[i];
            if (stack.isEmpty())
                stack.push(c);
            else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
