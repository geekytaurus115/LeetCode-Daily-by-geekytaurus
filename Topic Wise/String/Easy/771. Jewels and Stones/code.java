class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        boolean[] jewelSet = new boolean[150];
        for(int i = 0; i < jewels.length(); i++){
            jewelSet[jewels.charAt(i)] = true;
            
        }
        
        int c = 0;
        for(int i = 0; i < stones.length(); i++){
            if(jewelSet[stones.charAt(i)]){
                c++;
            }
        }
        
        return c;        
    }
}
