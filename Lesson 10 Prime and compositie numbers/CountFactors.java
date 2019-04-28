package codility;

public class CountFactors {
    static public int solution(int N) {
        // write your code in Java SE 8
        int result = 0;
        
        for (int n=1; n<=Math.sqrt(N); n++){
            if(N%n==0){
                if(n*n==N){
                    result++;
                }
                else{
                    result += 2;

                }
            }
        }
        
        return result;
    }
}
