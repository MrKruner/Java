class AddTwoSumSolution {
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;

        ListNode header = new ListNode(0);
        ListNode currentNode = header;
        while (l1!=null || l2!=null) {
            int sum = carry;
            int l1_val=0, l2_val=0;

            if(l1!=null){
                l1_val = l1.val; 
                l1 = l1.next;
            }

            if(l2!=null){
                l2_val = l2.val;
                l2 = l2.next;
            }

            sum += (l1_val+l2_val)%10;
            carry = (l1_val + l2_val)/10;
            currentNode.next = new ListNode(sum);
            currentNode = currentNode.next;
        }
        if(carry==1){
            currentNode.next = new ListNode(carry);
        }
        return header.next;
    }

    public static void main(String[] args) {
        
    }
}
