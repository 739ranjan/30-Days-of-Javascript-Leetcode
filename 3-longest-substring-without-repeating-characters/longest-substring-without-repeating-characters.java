class Solution {
    public int lengthOfLongestSubstring(String s) {
        String subStr = "";
        int maxLength = 0;

        for(int j=0; j<s.length(); j++){
            String ch = ""+s.charAt(j);
            if(subStr.contains(ch)){
                int ind = subStr.indexOf(ch);
                subStr = subStr.substring(ind+1);
            }
            subStr += ch;
            maxLength = Math.max(subStr.length(), maxLength);
        }
        return maxLength;
    }
}