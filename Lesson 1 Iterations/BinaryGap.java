package codility;

public class BinaryGap {
	
    static public int solution(int N) {
        // write your code in Java SE 8
        int m;
        int l;
        int max=0;
        int count = 0;
        String x = "";
        boolean sw = false;

        while (N>0){
            l = N % 2;
            if (l==1){
                sw = true;
                if (count>max){
                    max = count;
                }
                count = 0;
            }
            else{
                if(sw == true){
                    count++;
                }
            }
            x = x + "" + l;
            N = N / 2;
        }

        return max;
    }
}
