class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            }else if(!stk.isEmpty() && (ch == ')' || ch == '}' || ch == ']')){
                if(ch == ')' && stk.peek() == '(')
                    stk.pop();
                else if(ch == '}' && stk.peek() == '{')
                    stk.pop();
                else if(ch == ']' && stk.peek() == '[')
                    stk.pop();
                else
                    return false;
            }else if(stk.isEmpty() && (ch == ')' || ch == '}' || ch == ']'))
                return false;
        }
        return stk.isEmpty();
    }
}