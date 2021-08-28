class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> preRow = new ArrayList<>();
        
        preRow.add(1);
        ans.add(new ArrayList<Integer>(preRow));
        
        if(numRows == 1)              
            return ans;
        
        preRow.add(1);
        ans.add(new ArrayList<Integer>(preRow));
        
        if(numRows == 2)                 
            return ans;
        
        
        for(int i = 3; i <= numRows; i++){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);                  //As 1st ele of each row is 1
            
            for(int j = 0; j < i-2; j++)
                list.add(preRow.get(j) + preRow.get(j+1));
            
            list.add(1);                  //As last ele of each row is 1
            ans.add(new ArrayList<Integer>(list));
            
            preRow = list;                //Updating the previous row
        }
        
        return ans;
        
        
    }
}
