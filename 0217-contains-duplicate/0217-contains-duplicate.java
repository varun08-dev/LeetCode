class Solution {
    public boolean containsDuplicate(int[] nums) {
        //[1,2,3,1]
        HashMap<Integer, Integer> map = new  HashMap<Integer, Integer>();
        for(int i=0; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i],1);
            }
        }

        return false;
    }
}