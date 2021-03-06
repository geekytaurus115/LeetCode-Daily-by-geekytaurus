class Solution {
   public int maxTurbulenceSize(int[] A) {
    int mx = 0, c = 0;

    for(int i = 0; i < A.length; i++) {
        if(i >= 2 && ((A[i-2] > A[i-1] && A[i-1] < A[i]) ||
                      (A[i-2] < A[i-1] && A[i-1] > A[i])) ) {
            
            c++;
        } 
        else if(i >= 1 && A[i-1] != A[i]) {
            
            c = 2;
        }
        else {
            
            c = 1;
        }
        mx = Math.max(mx, c);
    }
    return mx;    
}
}
