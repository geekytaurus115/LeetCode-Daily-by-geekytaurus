class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int len = nums.length;
        int[] ans = new int[len];
        
        int l = 0;        //left pointer
        int r = len - 1;  //right pointer
        int i = len - 1;  //tracking index for ans array
        
        while(l <= r){
            int a = nums[l] * nums[l];
            int b = nums[r] * nums[r];
            
            if(a > b){
                ans[i] = a;
                l++;
            }
            else{
                ans[i] = b;
                r--;
            }
            
            i--;
        }
        
        return ans;
        
    }
}
