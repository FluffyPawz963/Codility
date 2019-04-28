package codility;

import java.util.Arrays;

public class TapeEquilibrium {
    static public int solution(int[] A) {
        // write your code in Java SE 8
        int[] ResultAry = new int[A.length-1];
        int firstHalf = 0;
        int secondHalf = 0;
        int total = 0;
        
        for(int x=0;x<A.length; x++){
            total = total + A[x];
        }
        
        for(int p=0;p<A.length-1;p++){
            
            firstHalf = firstHalf + A[p];
            secondHalf = total - firstHalf;
            ResultAry[p] = Math.abs(firstHalf - secondHalf);
        }
        Arrays.sort(ResultAry);
        return ResultAry[0];
    }
}


