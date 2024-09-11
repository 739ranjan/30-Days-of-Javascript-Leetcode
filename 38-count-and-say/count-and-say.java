class Solution {
    public StringBuilder convert(StringBuilder sb){
        StringBuilder converted = new StringBuilder();
        int count = 1;
        int left = 0, right = 1;
        while(left < sb.length()){
            while(right < sb.length() && sb.charAt(left) == sb.charAt(right)){
                count++;
                right++;
            }
            converted.append(count+""+sb.charAt(left));
            left = right++;
            count = 1;
        }
        return converted;
    }

    public String countAndSay(int n) {
        int i = 1;
        StringBuilder sb = new StringBuilder("1");

        for( ;i<n; i++){
            sb = convert(sb);
        }
        return sb.toString();
    }
}