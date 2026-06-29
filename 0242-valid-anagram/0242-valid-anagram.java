import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }else{
            char[] x= s.toCharArray();
            char[] y= t.toCharArray();

            Arrays.sort(x);
            Arrays.sort(y);

            if(Arrays.equals(x,y)){
                return true;
            }
        }

        return false;
    }
}