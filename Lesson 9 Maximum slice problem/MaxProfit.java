package codility;

/*
 * Notice that the line 16 the logic is different from the MaxSliceSum example
 * Because profit has no negative value, thus min is 0
 * 
 * */


public class MaxProfit {
	   static public int solution(int[] A) {
	        // write your code in Java SE 8
	        int maxProfitOnBeforeDay = 0;
	        int maxProfit = 0;
	        
	        for (int s=1; s<A.length; s++){
	            maxProfitOnBeforeDay = Math.max(0, maxProfitOnBeforeDay + A[s]-A[s-1]);
	            maxProfit = Math.max(maxProfit, maxProfitOnBeforeDay);
	        }
	        return maxProfit;
	    }
}
