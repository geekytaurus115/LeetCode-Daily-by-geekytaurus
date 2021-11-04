class Solution {
    public ListNode middleNode(ListNode head) {
       
        ListNode f = head;  //fast
        ListNode s = head;  //slow
        
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        
        return s;
       
    }
}
