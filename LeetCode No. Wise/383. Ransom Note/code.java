class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int r = ransomNote.length();
        int m = magazine.length();
        
        if(r > m){
            return false;
        }
        
        int[] countFreq = new int[26];
        
        for(char ch : magazine.toCharArray()){
            countFreq[ch - 'a']++;
        }
        
        for(char ch : ransomNote.toCharArray()){
            
            if(countFreq[ch - 'a'] == 0)
                return false;
            countFreq[ch - 'a']--;
        }
        return true;
        
    }
}
