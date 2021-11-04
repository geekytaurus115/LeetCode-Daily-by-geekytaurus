class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode curr = head;
        
        int len = 0;    //length of list
        while(curr != null){
            len++;
            curr = curr.next;
        }
        
        
        int mid = len / 2 + 1;
        ListNode midNode = head;
        
        for(int i = 1; i < mid; i++){
            midNode = midNode.next;
        }
        
        return midNode;       
        
    }
}
