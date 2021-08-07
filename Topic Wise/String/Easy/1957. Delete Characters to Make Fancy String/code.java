class Solution {
    public String makeFancyString(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        if(s.length() < 3){
            return s;
        }
        else{
            
        for(int i = 0; i < s.length()-2; i++){
            
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i+2)){
                //do nothing
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        
        sb.append(s.charAt(s.length()-2));
        sb.append(s.charAt(s.length()-1));
        
        
        return sb.toString();
    }
        
    }
}
