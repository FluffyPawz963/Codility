package codility;

import java.util.Stack;

public class Dominator {
	static public int solution(int[] A) {
        // write your code in Java SE 8
        int candidate = 0;
		int candidateCount = 0;
		int index = 0;
		Stack<Integer> s = new Stack<Integer>();
		
		if(A.length==0){
		    return -1;
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
		    return -1;
		}
		
		candidate = s.peek();
		
		for (int m = 0; m<A.length; m++) {
			if(A[m]==candidate) {
				candidateCount++;
				index = m;
			}
		}
		
		if(candidateCount>A.length/2) {
			return index;
		}
		else {
			return -1;
		}
    }
}
