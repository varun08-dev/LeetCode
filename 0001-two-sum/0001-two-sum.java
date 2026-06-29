import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //nums = [2,7,11,15]
        //target = 9
       HashMap<Integer, Integer> map = new HashMap<>();

       for(int i=0; i< nums.length ; i++){
             int left = target - nums[i];

             if(map.containsKey(left)){
                return new int[]{map.get(left), i};
             }
             else{
                map.put(nums[i],i);
             }
       }

      return new int[]{}; 
      
    }
}