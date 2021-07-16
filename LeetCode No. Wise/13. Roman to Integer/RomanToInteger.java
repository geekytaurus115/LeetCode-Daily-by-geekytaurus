class Solution {
    public int romanToInt(String s) {
           int[] code = new int[s.length()];
        
           for(int i = 0; i < s.length(); i++){
               switch(s.charAt(i)){
                   case 'I' :
                       code[i] = 1;
                       break;
                   case 'V' :
                       code[i] = 5;
                       break;
                   case 'X' :
                       code[i] = 10;
                       break;
                   case 'L' :
                       code[i] = 50;
                       break;
                   case 'C' :
                       code[i] = 100;
                       break;
                   case 'D' :
                       code[i] = 500;
                       break;
                   case 'M' :
                       code[i] = 1000;
                       break;
               }
           }
    
         int sum = 0;
          for(int i = 0; i < s.length()-1; i++){
              if(code[i] < code[i+1]){
                  sum -= code[i];
              }else{
                  sum += code[i];
                  
              }
          }
          return sum + code[s.length()-1];
        
    }
           
}
