class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        int[] countFreq = new int[26];
        
        for(char ch : s.toCharArray()){
            countFreq[ch - 'a']++;
        }
        
        for(char ch : t.toCharArray()){
            countFreq[ch - 'a']--;
        }
        
        for(int i = 0; i < 26; i++){
            if(countFreq[i] != 0){
                return false;
            }
        }
        
        return true;
        
    }
}
