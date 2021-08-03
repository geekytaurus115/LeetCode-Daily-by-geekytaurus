class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int i : nums1){
            set.add(i);
        }
        
        Set<Integer> intersection = new HashSet<>();
        
        for(int j : nums2){
            if(set.contains(j)){
                intersection.add(j);
            }
        }
        
        int[] result = new int[intersection.size()];
        int k = 0;
        for(int i : intersection){
            result[k++] = i;
        }
        
        return result;
    }
}
