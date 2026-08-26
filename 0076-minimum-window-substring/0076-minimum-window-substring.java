class Solution {
    public String minWindow(String s, String t) {

    
    int startIndex =0;
	int minLength= Integer.MAX_VALUE;

	int hash[] =  new int[256];
	for (Character character : t.toCharArray()) {
		hash[character]++;
	}


    int left=0;
    int right=0;
    int count=0;
    while(right<s.length()){
        if(hash[s.charAt(right)]>0){
            count++;
        }
        hash[s.charAt(right)]--;

        while(count==t.length()){
            if(right-left+1<minLength){
                minLength=right-left+1;
                startIndex=left;
            }

            hash[s.charAt(left)]++;
            if(hash[s.charAt(left)]>0){
                count--;
            }
            left++;
        }
        right++;
    }

    
    if (s.length() < t.length() || t.length() == 0 || minLength==Integer.MAX_VALUE) {
        return "";
    }
	
    String result = s.substring(startIndex, startIndex +minLength);
    return result;
    }
    
}