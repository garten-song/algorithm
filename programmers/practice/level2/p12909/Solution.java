package practice.level2.p12909;

public class Solution {

    public static void main(String[] args) {
        boolean s = solution("())((()))(()");
        System.out.println(s);
    }

    static public boolean solution(String s) {
        boolean answer = false;
        char[] charArr = s.toCharArray();

        int openCnt = 0;
        int closeCnt = 0;

        if (charArr[0] != '(' || charArr[charArr.length - 1] != ')')
            return false;

        for (int i = 0; i < charArr.length; i++) {
            if (openCnt == 0 && closeCnt == 0 && charArr[i] != '(')
                return false;

            if (charArr[i] == '(')
                openCnt += 1;
            else if (charArr[i] == ')')
                closeCnt += 1;


            if (openCnt == closeCnt) {
                openCnt = 0;
                closeCnt = 0;
            }
        }

        if (openCnt == 0 && closeCnt == 0)
            answer = true;


        return answer;
    }
}
