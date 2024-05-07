class Solution {
    private boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        
        return false;
    }
    public int maxVowels(String s, int k) {
        int[] vowels = new int[26];
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<k; i++){
            char ch = s.charAt(i);
            if(isVowel(ch))
                count++;
        }

        max = count;
        System.out.println(count);
        for(int i=0, j=k; j<s.length(); i++,j++){
            char chi = s.charAt(i);
            char chj = s.charAt(j);
            if(isVowel(chi))
                count--;
            if(isVowel(chj))
                count++;
            max = Math.max(count, max);
        }
        return max;
    }
}