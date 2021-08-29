class Solution {
    public int firstUniqChar(String s) {
        
        int countFreq[] = new int[26];
        
        for(char i : s.toCharArray())
            countFreq[i - 'a']++;
        
        for(int i = 0; i < s.length(); i++){
            if(countFreq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        
        return -1;
    }
}
