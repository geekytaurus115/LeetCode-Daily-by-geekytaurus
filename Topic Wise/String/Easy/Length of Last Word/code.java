class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        
        int len = 0;
        int i = s.length()-1;
        while(i >= 0 && s.charAt(i) != ' '){
            len++;
            i--;
        }
        
        return len;
    }
}
