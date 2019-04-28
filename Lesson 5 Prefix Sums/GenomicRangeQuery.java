package codility;

import java.util.Arrays;
import java.util.HashMap;

public class GenomicRangeQuery {
	static public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        HashMap<String, Integer> map = new HashMap();
        int[] result = new int[P.length];
        int[] P_Count; 
        int[] Q_Count;
        
        map.put("A",1);
        map.put("C",2);
        map.put("G",3);
        map.put("T",4);
        
        int[][] prefixSum = new int[S.length()][4];
        
        for (int s = 0; s < S.length(); s++){
            String tmp = S.substring(s, s+1);
            if(s!=0){
                prefixSum[s] = Arrays.copyOf(prefixSum[s-1], prefixSum[s-1].length);
            }
            prefixSum[s][map.get(tmp)-1] = prefixSum[s][map.get(tmp)-1] + 1;
        }

        for (int i = 0; i<P.length; i++){

            P_Count = P[i]>0 ? prefixSum[P[i]-1]:new int[]{0,0,0,0}; 
            Q_Count = prefixSum[Q[i]];
        
            if(Q_Count[0]-P_Count[0]!=0){
                result[i] = 1;
            }
            else if(Q_Count[1]-P_Count[1]!=0){
                result[i] = 2;
            }
            else if(Q_Count[2]-P_Count[2]!=0){
                result[i] = 3;
            }
            else if(Q_Count[3]-P_Count[3]!=0){
                result[i] = 4;
            }
            else{
                result[i] =1;
            }
        }
        
        return result;
    }
}
