class Solution {
    public int[] sortArray(int[] nums) {
        
        int l = 0;
        int h = nums.length-1;
        return mergeSort(nums, l, h);
        
    }
    
    public static int[] mergeSort(int[] arr, int l, int h){
        if(l == h){
            int[] base = new int[1];
            base[0] = arr[l];
            return base;
        }
        int mid = (l + h) / 2;
        
        int[] fsh = mergeSort(arr, l, mid);
        int[] ssh = mergeSort(arr, mid+1, h);
        int[] fsa = mergeTwoSortedArray(fsh, ssh);
        
        return fsa;
    }
    
    public static int[] mergeTwoSortedArray(int[] a, int[] b){
        
        int[] mergedArray = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < a.length && j < b.length){
            
            if(a[i] < b[j]){
                mergedArray[k++] = a[i++];
            }else{
                mergedArray[k++] = b[j++];
            }
            
        }
        while(i < a.length){
            mergedArray[k++] = a[i++];
            
        }
        
        while(j < b.length){
            
                mergedArray[k++] = b[j++];
            }
        return mergedArray;
        }
        
    }
