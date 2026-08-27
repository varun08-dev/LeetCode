class Solution {
    public int characterReplacement(String s, int k) {
     	
		int left=0,right=0, maxLength=0, maxFrequency=0;
		int hash[]= new int[256];
		int changes=0;
		
		while (right<s.length()) {
			
			hash[s.charAt(right)]++;
			maxFrequency=Math.max(maxFrequency, hash[s.charAt(right)]);
			changes=(right-left+1)-maxFrequency;
			
			while (changes>k) {
				hash[s.charAt(left)]--;
				left++;
				changes = (right-left+1)-maxFrequency;
			}
			
			//window is valid
			maxLength = Math.max(maxLength, right - left + 1);
			right++;
		}
		
		return maxLength;

	
    }
}