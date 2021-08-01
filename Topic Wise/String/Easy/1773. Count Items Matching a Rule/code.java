class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int c = 0;
        
        int index = -1;
        
        if(ruleKey.equals("type")){
            index = 0;
        }else if(ruleKey.equals("color")){
            index = 1;
        }else{
            index = 2;
        }
        
        for(List<String> list : items){
            if(list.get(index).equals(ruleValue)){
                c++;
            }
        }
        
        return c;
    }
}
