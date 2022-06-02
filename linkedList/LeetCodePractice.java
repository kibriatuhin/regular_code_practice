package linkedList;

public class LeetCodePractice {
    ListNode head;
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }

    //add fast
    void addFast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        int count = 0;

        while (currentNode != null){
            currentNode = currentNode.next;
            count++;
        }
        currentNode = head;
        if (count==n){
            return head.next;
        }
        for (int i=1 ;i<count - n+1 ; i++){
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;


        return  head;
    }

    //print
    void display(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        ListNode currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.val + "-> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LeetCodePractice linkedList = new LeetCodePractice();
        linkedList.addFast(10);
        linkedList.addFast(11);
        linkedList.addFast(12);
        linkedList.display();

    }
}
