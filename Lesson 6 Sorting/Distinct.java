package codility;

import java.util.HashSet;

public class Distinct {
    static public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet <Integer> newDistList = new HashSet<Integer>();
        for (int s = 0; s<A.length; s++){
            newDistList.add(A[s]);
        }
        return newDistList.size();
    }
}
