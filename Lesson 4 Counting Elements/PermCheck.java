package codility;

import java.util.Arrays;

public class PermCheck {

	    public int solution(int[] A) {
	        // write your code in Java SE 8
	        Arrays.sort(A);
	        for (int l = 0; l<A.length; l++){
	            if(A[l]!=l+1){
	                return 0;
	            }
	        }
	        return 1;
	    }
}
