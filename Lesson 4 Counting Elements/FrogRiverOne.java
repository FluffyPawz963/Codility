package codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        Set refSet = new HashSet();
        Set positionSet = new HashSet();

        for(int i = 1; i<X+1; i++){
            refSet.add(i);
        }
        
        for (int u = 0; u<A.length; u++){
            positionSet.add(A[u]);
            if(refSet.equals(positionSet)){
                return u;
            }
            
        }   

        return -1;
    }
}
