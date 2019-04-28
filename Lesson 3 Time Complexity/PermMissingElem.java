package codility;
import java.util.Arrays;

public class PermMissingElem {
	    public int solution(int[] A) {
	        // write your code in Java SE 8
	        if(A.length==0){
	            return 1;
	        }
	        Arrays.sort(A);
	        for (int c = 0; c<A.length; c++){
	            if(A[c]-c>1){
	                return c+1;
	            }
	        }
	        return A[A.length-1]+1;
	    }
}
