package practice.level2.p70129;

public class Solution {
    public int[] solution(String s) {
        int transCnt = 0;
        int deleteCnt = 0;

        while (s.length() > 1) {
            int deleteLength = s.replace("1", "").length();
            s.replace("0", "");
            s = Integer.toBinaryString(s.length() - deleteLength);
            deleteCnt += deleteLength;
            transCnt++;
        }

        int[] answer = {transCnt, deleteCnt};

        return answer;
    }
}
