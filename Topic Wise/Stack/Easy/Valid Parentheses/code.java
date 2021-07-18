class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stck.push(ch);
            }
            else if(stck.isEmpty()){
                return false;
            }
            else if(ch == ')' && stck.pop() != '('){
                return false;
            }
            else if(ch == '}' && stck.pop() != '{'){
                return false;
            }
            else if(ch == ']' && stck.pop() != '['){
                return false;
            }
        }
        
        return stck.isEmpty();
    }
}
