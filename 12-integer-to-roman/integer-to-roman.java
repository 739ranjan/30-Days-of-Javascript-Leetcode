class Solution {
    public String intToRoman(int num) {
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] value = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder res = new StringBuilder();
        for(int i=value.length-1; num>0 || i>0 ; i--){
            int div = num / value[i];
            num = num % value[i];
            for(int j = div; j>0; j--){
                res.append(roman[i]);
            }
        }
        return res.toString();
    }
}