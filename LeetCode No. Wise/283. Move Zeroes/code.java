class Solution {
    public void moveZeroes(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return;
        }
        
        int insertPosition = 0;
        for(int num : nums){
            if(num != 0){
                nums[insertPosition++] = num;
            }
        }
        
        while(insertPosition < nums.length){
            nums[insertPosition++] = 0;
        }
        
    }
}
