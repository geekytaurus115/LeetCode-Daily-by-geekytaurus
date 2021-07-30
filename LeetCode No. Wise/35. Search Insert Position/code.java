class Solution {
    public int searchInsert(int[] nums, int target) {
        int k = 0;
        if(nums[nums.length-1] < target){
            k = nums.length;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                k = i;
                break;
            }
            else if(nums[i] > target){
                k = i;
                break;
            }
          
        }
        return k;
        
    }
}
