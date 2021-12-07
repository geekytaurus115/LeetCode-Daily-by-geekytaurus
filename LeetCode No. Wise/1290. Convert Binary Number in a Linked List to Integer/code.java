class Solution {
    public int getDecimalValue(ListNode head) {
        
        List<Integer> list = new ArrayList<>();
        
        while(head != null){
            
            list.add(head.val);
            head = head.next;
        }
        
        int p = 1; //2^0 = 1
        int ans = 0;
        
        for(int i = list.size()-1; i >= 0; i--){
            ans += list.get(i) * p;
            
            p *= 2;
        }
        
        return ans;
        
    }
}
