package practice.level2.p12951;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        String s = solution("  For The What 1what  ");
        System.out.println(s);
    }

    static public String solution(String s) {
        s = s.toLowerCase();
        int blankIdx = s.indexOf(" ");

        StringBuilder sb = new StringBuilder(s);

        if (!Character.isDigit(sb.charAt(0))) {
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        }

        while (blankIdx >= 0) {
            if (blankIdx != sb.length() - 1 && !Character.isDigit(sb.charAt(blankIdx + 1))) {
                sb.setCharAt(blankIdx + 1, Character.toUpperCase(sb.charAt(blankIdx + 1)));
            }
            blankIdx = s.indexOf(" ", blankIdx + 1);
        }

        return sb.toString();
    }
}
