class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode start = new ListNode(0);
        ListNode f = start; //fast
        ListNode s = start; //slow
        f.next = head;
        
        //making the gap between fast & slow
        for(int i = 1; i <= n+1; i++){
            f = f.next;
        }
        
        while(f != null){
            s = s.next;
            f = f.next;
        }
        s.next = s.next.next;
        
        return start.next;
    }
    
    
}
