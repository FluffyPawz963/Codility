package codility;

public class TieRopes {
    static public int solution(int K, int[] A) {
        // write your code in Java SE 8
        int Max=0;
        int reminder = 0;
 
        for (int s = 0; s<A.length; s++){
                if(A[s] + reminder >= K){
                    Max++;
                    reminder = 0;                    
                }
                else{
                    reminder = reminder + A[s];
                }
        }
        return Max;
    }
}
