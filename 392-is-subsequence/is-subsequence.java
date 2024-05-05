class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t))
            return true;
        
        int sInd=0, tInd=0;
        for(; sInd<s.length() && tInd<t.length(); tInd++){
            if(s.charAt(sInd) == t.charAt(tInd)){
                sInd++;
            }
        }

        return sInd == s.length();
    }
}