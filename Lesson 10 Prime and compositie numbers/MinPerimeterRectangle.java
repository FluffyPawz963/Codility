package codility;

public class MinPerimeterRectangle {
    static public int solution(int N) {
        // write your code in Java SE 8
        int minPerimeter = 2*(1+N);
        
        for (int n=1; n<=Math.sqrt(N); n++){
        	
            if(N%n==0){
                minPerimeter = Math.min(2*(n+N/n), minPerimeter);
            }
        }
        
        return minPerimeter;
    }
}
