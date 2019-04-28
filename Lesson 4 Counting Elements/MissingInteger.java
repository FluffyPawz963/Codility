package codility;
import java.util.Arrays;

public class MissingInteger {
	public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 1;
        int c = 0;
        Arrays.sort(A);
        
        if(A[0]>1 || A[A.length-1]<0){
                return 1;
        }
        else{
            
            for (c=0; c<A.length; c++){
            
                if(A[c]<=0){
                    A[c]=0;
                }
                if(c == 0){
                    if (A[0] >1){
                        return 1;
                    }
                } 
                else{
                    if (A[c] - A[c-1]>1){
                        return A[c-1]+1;
                    }
                } 
            }
        }
        result = A[A.length-1]+1;
        return result;
    }
}
