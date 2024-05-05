class Solution {

    private boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                return true;
            }
            return false;
    }

    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        StringBuffer vowel = new StringBuffer();

        for(int i=0; i<str.length; i++){
            if(isVowel(str[i])){
                vowel.append(str[i]);
            }
        }
        for(int i=0, j=vowel.length()-1; i<str.length && j>=0; i++){
            if(isVowel(str[i])){
                str[i] = vowel.charAt(j--);
            }
        }
        return new String(str);
    }
}