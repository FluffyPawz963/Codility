package codility;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] newA = new int[A.length];
        for (int i=0; i<A.length; i++){
            
            newA[(i+K)%A.length] = A[i];
        }
        return newA;
    }
}
