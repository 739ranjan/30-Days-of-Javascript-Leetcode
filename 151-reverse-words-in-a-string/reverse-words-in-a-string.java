class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            if(!words[i].equals("")){
                res.append(words[i]+" ");
            }
        }
        return new String(res).trim();
    }
}