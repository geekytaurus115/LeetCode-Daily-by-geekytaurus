public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int l = 1;
        int r = n;
        
        while(l < r){
            
            int mid = l + (r - l)/2;
            boolean ans = isBadVersion(mid);
            
            if(ans == false){
                l = mid + 1;
            }
            else{
                r = mid;
            }
            
        }
        return l;
    }
}
