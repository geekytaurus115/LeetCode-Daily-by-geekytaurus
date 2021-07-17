class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder LongCP = new StringBuilder();
        
        for(int i = 0; i < strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for(String innerStr : strs){
                if( (innerStr.length() <= i) || (innerStr.charAt(i) != ch)){
                    return LongCP.toString();
                }
            }
            
            LongCP.append(ch);
        }
        
        return LongCP.toString();
    }
}
