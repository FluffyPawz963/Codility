package codility;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for(int i = 0; i < A.length-1; i += 2) {
            if(A[i] != A[i+1]) {
                return A[i];
            }
        }
        return A[A.length-1];
    }
}
