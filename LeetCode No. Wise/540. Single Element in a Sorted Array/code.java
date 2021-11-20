class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        
        int l = 0;
        int r = nums.length - 1;
        
        while(l < r){
            
            int mid = l + (r - l) / 2;
            
            if(nums[mid] == nums[mid+1]){
                mid = mid - 1;
            }
            
            if((mid - l + 1 ) % 2 != 0){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        
        return nums[l];
        
    }
}
