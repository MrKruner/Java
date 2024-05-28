class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class MergeTwoSortListSolution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2 == null){
            return list1;
        }

        ListNode listResult = new ListNode(0);
        ListNode curNode = listResult;

        while(list1!=null || list2!=null){

            if(list1==null){
                curNode.next = list2;
                list2 = list2.next;
                continue;
            }
            else if(list2==null){
                curNode.next = list1;
                list1=list1.next;
                continue;
            }
            if(list1.val>list2.val){
                curNode.next = list2;
                list2 = list2.next;
            }else if(list1.val<=list2.val){
                curNode.next = list1;
                list1 = list1.next;
            }
            curNode = curNode.next;
        }

        return listResult.next;
    }

    public static void main(String[] args) {
        MergeTwoSortListSolution solution = new MergeTwoSortListSolution();
        System.out.println(solution.mergeTwoLists(new ListNode(), new ListNode(0)));
    }
}
