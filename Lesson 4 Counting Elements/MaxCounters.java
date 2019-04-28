package codility;

import java.util.Arrays;

public class MaxCounters {

	class Solution {
	    public int[] solution(int N, int[] A) {
	        // write your code in Java SE 8
	        int counters[] = new int[N];
	        int maxCounter = 0;
	        int lastMaxCounter = 0;
	        Arrays.fill(counters, 0);
	        
	        for (int p=0; p<A.length; p++){
	            if (A[p]>=1 &&A[p]<=N){
	                counters[A[p]-1] = Math.max(counters[A[p] - 1], lastMaxCounter);
	                counters[A[p]-1]++;
	                maxCounter = Math.max(maxCounter, counters[A[p] - 1]);
	            }
	            else if(A[p]==N+1){
	                lastMaxCounter = maxCounter;    
	            }
	        }
	        for(int i = 0 ; i < counters.length; i++) {
				counters[i] = Math.max(counters[i], lastMaxCounter);
			}
	        return counters;
	    }
	}
}
