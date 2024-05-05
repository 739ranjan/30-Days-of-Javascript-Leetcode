class Solution {
    public int compress(char[] chars) {
        if(chars.length <= 1)
            return chars.length;

        int gInd = 0, count=1;
        StringBuffer sb = new StringBuffer();
        for(int i=1; i<chars.length; i++){
            if(chars[gInd] == chars[i]){
                count++;
            }else{
                if(count>1)
                    sb.append(chars[gInd]+""+count);
                else
                    sb.append(chars[gInd]);
                count = 1;
                gInd = i;
            }
        }
        if(count>1)
            sb.append(chars[gInd]+""+count);
        else
            sb.append(chars[gInd]);
        // System.out.println(sb.toString());

        for(int i=0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}