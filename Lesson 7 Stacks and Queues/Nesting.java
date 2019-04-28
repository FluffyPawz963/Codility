package codility;

import java.util.HashMap;
import java.util.Stack;

public class Nesting {
	static public int solution(String S) {
        // write your code in Java SE 8
        HashMap<String, String> h = new HashMap<String, String>();
        Stack<String> s = new Stack<String>();

        h.put("(", ")");
        
        if (S.length()==0){
            return 1;
        }
        if (S.length()%2==1){
            return 0;
        }
        
        for (int n = 0; n<S.length(); n++){
            String tmp = Character.toString(S.charAt(n));
            if (tmp.equals("(")){
                s.push(tmp);
            }
            else{
                if(s.size()!=0){
                    s.pop();
                }
                else{
                    return 0;
                }
            }
        }
        
        if(s.size()==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
