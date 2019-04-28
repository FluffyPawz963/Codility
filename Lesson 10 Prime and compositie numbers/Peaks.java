package codility;

import java.util.Stack;

public class Peaks {
	public int solution(int[] A) {
        // write your code in Java SE 8
		int[] currentPeeksNo = new int[A.length];
        Stack<Integer> div = new Stack<Integer>();
        int count = 0;
        
        if(A.length<3){
            return 0;
        }
            
        for (int s=0; s<A.length; s++){
            
            if(s==0){
                currentPeeksNo[s] = 0;
            }
            else if(s!=A.length-1 && A[s]>A[s-1] && A[s]>A[s+1]){
                count++;   
            }
            
            currentPeeksNo[s] = count;

            if(A.length%(s+1)==0 && A.length/(s+1)>=2){
                div.push(s+1);
            }
        }

        currentPeeksNo[A.length-1] = currentPeeksNo[A.length-2];   

        while(!div.isEmpty()){
            
            int d = A.length / div.peek();
            int c = 0;

            while (c*d <currentPeeksNo.length){
                
                if ((c==0 &&currentPeeksNo[0] == currentPeeksNo[d-1]) || (c!=0 && currentPeeksNo[c*d-1] == currentPeeksNo[(c+1)*d-1])){
                    div.pop();
                    break;
                }

                c++;
                if(c*d==currentPeeksNo.length){
                    return div.peek();
                }  
            }; 
        }
        return 0;
    }
}
