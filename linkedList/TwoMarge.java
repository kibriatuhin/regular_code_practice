package linkedList;

public class TwoMarge {
    ListNode node;
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0) ;
        ListNode current = head;

        while (list1!=null && list2!=null)
        {
            if (list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current = (list1 == null) ? list2 :list1;
        return head.next;
    }

    public static void main(String[] args) {

    }
}
