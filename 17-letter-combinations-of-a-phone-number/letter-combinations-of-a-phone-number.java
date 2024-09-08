class Solution {
    public void solve(int ind, StringBuilder sb, String digits, List<String> res, Map<Character, String> map){
        // reached end of string
        if(ind == digits.length()){
            res.add(sb.toString());
            return;
        }

        String str = map.get(digits.charAt(ind));
        for(int i=0; i<str.length(); i++){
            sb.append(str.charAt(i));
            solve(ind+1, sb, digits, res, map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        
        List<String> res = new ArrayList<>();
        if(digits.length() == 0)
            return res;
            
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        solve(0, new StringBuilder(), digits, res, map);
        return res;
    }
}