class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = 0; i < nums2.length; i++){
            nums1[m++] = nums2[i];
        }
        
        for(int i = 0; i < nums1.length; i++){
            for(int j = i+1; j < nums1.length; j++)
            if(nums1[i] > nums1[j]){
                int tmp = nums1[i];
                nums1[i] = nums1[j];
                nums1[j] = tmp;
            }
        }
    }
}
