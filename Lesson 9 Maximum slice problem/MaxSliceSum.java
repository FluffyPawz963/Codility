package codility;

public class MaxSliceSum {
	   static public int solution(int[] A) {
	        // write your code in Java SE 8
	        int max=A[0];
	        int maxEnd=A[0];
			
			for (int s= 1; s<A.length; s++) {
			    maxEnd = Math.max(A[s], maxEnd+A[s]);
				max = Math.max(max, maxEnd);
			}
			
			return max;
	    }
}
