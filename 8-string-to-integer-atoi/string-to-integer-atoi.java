class Solution {
    public static boolean isDigit(char ch){
        if(ch >= '0' && ch <= '9')
            return true;
        return false;
    }

    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty() || (!isDigit(s.charAt(0)) && s.charAt(0) != '+' && s.charAt(0) != '-'))
            return 0;
        
        int sign = 1;
        if(s.charAt(0) == '-'){
            sign = -1;
            s = s.substring(1);
        }
        else if(s.charAt(0) == '+'){
            s = s.substring(1);
        } 
        // System.out.println(s);
        long res = 0;

        for(int i=0; i<s.length(); i++){
            if(res*sign > Integer.MAX_VALUE){
                return  Integer.MAX_VALUE;
            }
            if(res*sign < Integer.MIN_VALUE){
                return  Integer.MIN_VALUE;
            }
            char ch = s.charAt(i);
            if(!isDigit(s.charAt(i))){
                break;
            }
            res = res * 10 + (ch - '0');
        }
        if(res*sign > Integer.MAX_VALUE){
            return  Integer.MAX_VALUE;
        }
        if(res*sign < Integer.MIN_VALUE){
            return  Integer.MIN_VALUE;
        }
        return (int)(res*sign);
    }
}