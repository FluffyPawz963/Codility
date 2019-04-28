package codility;

import java.util.Stack;

public class EquiLeader {
    public int solution(int[] A) {
        // write your code in Java SE 8
    	int candidate = 0;
		int candidateCount = 0;
		int exisitingCandidate = 0;
		int equiLeaderCount = 0;
		
		Stack<Integer> s = new Stack<Integer>();
		
		if(A.length==0){
		    return 0;
		}
		
		for (int n=0; n<A.length; n++) {
			if(s.size()>0 && A[n]!=s.peek()) {
				s.pop();
			}
			else {
				s.push(A[n]);
			}
		}
		
		if(s.size()==0){
		    return 0;
		}
		
		candidate = s.peek();
		
		for (int m = 0; m<A.length; m++) {
			if(A[m]==candidate) {
				candidateCount++;
			}
		}
		
		if(candidateCount<A.length/2) {
			return 0;
		}
		
		for (int k = 0; k<A.length; k++){
		    if(A[k]==candidate){
		        exisitingCandidate++;
		    }
            if(exisitingCandidate>(k-0+1)/2 && (candidateCount-exisitingCandidate)>(A.length-k-1)/2){
                equiLeaderCount++;
            }		    
		}
		return equiLeaderCount;
    }
}
