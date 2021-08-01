class Solution {
    public int balancedStringSplit(String s) {
        
        int c = 0;
        int bl = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R'){
                bl++;
            }else{
                bl--;
            }
            
            if(bl == 0){
                c++;
            }
        }
        
        return c;
    }
}
