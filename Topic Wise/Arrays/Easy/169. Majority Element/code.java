class Solution {
    public int majorityElement(int[] nums) {
        
        int c = 1;
        int majorityEle = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == majorityEle){
                c++;
            }else{
                c--;
            }
            
            if(c == 0){
                majorityEle = nums[i];
                c = 1;
            }
        }
        
        return majorityEle;
    }
}
