class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> duplicates = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            int t = Math.abs(nums[i]);
            
            if(nums[t - 1] < 0){
                duplicates.add(t);
            }
            else{
                nums[t - 1] = nums[t - 1] * (-1);
            }
        }
        
        return duplicates;
        
    }
