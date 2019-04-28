package codility;

public class PassingCars {
	    public int solution(int[] A) {
	        // write your code in Java SE 8
	        int avaliablePassing = 0;
	        int result=0;
	        for (int c=0; c<A.length; c++){
	            if (A[c]==0){
	                avaliablePassing++;
	            }
	            if(avaliablePassing>0){
	                if(A[c]==1){
	                    result += avaliablePassing;
	                    if (result>1_000_000_000){
	                        return -1;
	                    }
	                }
	            }
	            
	        }
	        return result;
	    }
}
