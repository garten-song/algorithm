package practice.level2.p12941;

import java.util.Arrays;

public class Solution {
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        int bIdx = B.length - 1;
        for (int i = 0; i < A.length; i++) {
            int mNum = 0;
            if (bIdx >= 0) {
                mNum = A[i] * B[bIdx];
            }
            answer += mNum;
            bIdx--;
        }

        return answer;
    }
}
