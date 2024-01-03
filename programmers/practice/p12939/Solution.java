package practice.p12939;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        String[] sArr = s.split(" ");
        int[] sNumArr = Arrays.stream(sArr).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(sNumArr);

        return sNumArr[0] + " " + sNumArr[sNumArr.length - 1];
    }
}
