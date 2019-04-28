package codility;

import java.util.Arrays;

public class MaxProductOfThree {
    static public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);  
        return Math.max(A[A.length-3] * A[A.length-2] * A[A.length-1], A[0] * A[1] * A[A.length-1]);           
    }
}
