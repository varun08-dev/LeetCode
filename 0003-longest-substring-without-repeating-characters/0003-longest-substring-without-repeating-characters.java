class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength=0;
	for (int i = 0; i < s.length(); i++) {
		String str = "";
		int hash[]= new int[255];
		
		for (int j = i; j < s.length(); j++) {
			if (hash[s.charAt(j)]==1) {
				break;
			}
			else {
				hash[s.charAt(j)]=1;
				str=str + (s.charAt(j));
				maxlength=Math.max(maxlength, j-i+1);
			}
			
			
		}
		//System.out.println(str);
	}
	return maxlength;
    }
}