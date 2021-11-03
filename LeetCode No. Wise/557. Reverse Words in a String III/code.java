class Solution {
    public String reverseWords(String s) {
        
        String[] strArr = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        
        int len = strArr.length;
        for(int i = 0; i < len; i++){
        
            StringBuilder sb = new StringBuilder(strArr[i]);
            res.append(sb.reverse());
            
            if(i < len-1){
                res.append(" ");
            }
        }
        
        return res.toString();
        
    }
}
