 



class RemoveLinkedListElements {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        
        ListNode newHead = new ListNode();
        ListNode curNode = newHead;

        while (head != null) {

            if(head.val != val){
                curNode.next = new ListNode(head.val);
                curNode = curNode.next;
            }
            
            head = head.next;
        }
        
        return newHead.next;
    }    
}
