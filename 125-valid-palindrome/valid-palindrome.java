class Solution {
    public boolean check(String s, int beg, int end){
        if(beg >= end)
            return true;
        if(s.charAt(beg) != s.charAt(end))
            return false;
        if(beg < end-1)
            return check(s, beg+1, end-1);
        return true;
    }
    public boolean isPalindrome(String s) {
        String spec = "`~!@#$%^&*\'()-_=+}]{\"[:;><.,?|/ \\";
        for(int i=0; i<spec.length(); i++){
            s = s.replace(""+spec.charAt(i), "");
        }
        s = s.toLowerCase();
        return check(s, 0, s.length()-1);
    }
}