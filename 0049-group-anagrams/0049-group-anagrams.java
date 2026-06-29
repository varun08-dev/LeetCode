import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
         Map<String,List<String>> map = new HashMap<>();

         for(int i =0; i< strs.length;i++){
            char[] x= strs[i].toCharArray();
            Arrays.sort(x);
            String word = Arrays.toString(x);

            map.putIfAbsent(word, new ArrayList<String>());
            if(map.containsKey(word)){
                map.get(word).add(strs[i]);
            }
            
            
         }

        return new ArrayList<>(map.values());

    }    
}