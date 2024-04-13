class Solution {
    private int gcd(int num1, int num2){
        if(num1 == 0)
            return num2;
        return gcd(num2 % num1, num1);
    }

    private boolean isEqual(int start, String str, StringBuilder common, int commonLen ){
        for(int i=0; i<commonLen; i++){
            if(str.charAt(start + i) != common.charAt(i))
                return false;
        }
        return true;
    }

    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();

        if(len1 == len2){
            if(str2.equals(str1))
                return str2;
            else
                return "";
        }

        int gcdLen = gcd(len2, len1);

        StringBuilder common = new StringBuilder(str2.substring(0, gcdLen));

        for(int i = 0; i < len1; i += gcdLen){
            if(!isEqual(i, str1, common, gcdLen))
                return "";
        }

        for(int i = 0; i < len2; i += gcdLen){
            if(!isEqual(i, str2, common, gcdLen))
                return "";
        }
        return new String(common);
    }
}