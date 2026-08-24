class Solution {
    public int lengthOfLongestSubstring(String s) {
    int maxlength=0;
	int left=0;
	int right=0;
	int hash[]= new int[255];
		 
		for (right = 0; right < s.length(); right++) {
			while(hash[s.charAt(right)]==1) {
				hash[s.charAt(left)]=0;
				left++;
			}
			
				hash[s.charAt(right)]=1;
				maxlength=Math.max(maxlength, right-left+1);
			
			
			
		}
	
	 return maxlength;
	
    }
}