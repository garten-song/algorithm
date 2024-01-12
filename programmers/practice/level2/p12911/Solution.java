package practice.level2.p12911;

public class Solution {

    public int solution(int n) {
        boolean chk = true;
        int bCnt = Integer.bitCount(n);

        while (chk) {
            n++;
            if (bCnt == Integer.bitCount(n)) chk = false;
        }

        return n;
    }
}
