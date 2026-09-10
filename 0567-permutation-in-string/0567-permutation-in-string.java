class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int hash[]= new int [256];
		int hash2[]= new int [256];
		for (int i = 0; i < s1.length(); i++) {
			hash[s1.charAt(i)]++;
		}
		
		int windowSize= s1.length();
		int left=0;
		int right=0;
		
		while (right<s2.length()) {
			hash2[s2.charAt(right)]++;
			
			if (right-left+1>windowSize) {
				hash2[s2.charAt(left)]--;
				left++;
			}
			if (right-left+1==windowSize) {
				if (Arrays.equals(hash, hash2)) {
					return true;
					
				}
				
			}
			
			
			right++;
		}
		
		return false;
    }
}