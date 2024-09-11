class Solution {

    public void helper(String str, int open, int close, List<String> res, int n){
        if(str.length() == n * 2){
            if(!res.contains(str))
                res.add(str);
            return;
        }
        if(open < n)
            helper(str+"(", open+1, close, res, n);
        if(close < open)
            helper(str+")", open, close+1, res, n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper("", 0, 0, res, n);
        
        return res;
    }
}