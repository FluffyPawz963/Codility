package codility;

import java.util.Arrays;

public class Triangle {
    static public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for (int s = 0; s<A.length-2; s++){
            if ((long)A[s]+(long)A[s+1]>(long)A[s+2]){
                return 1;
            }
        }
        return 0; 
    }
}
