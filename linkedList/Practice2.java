package linkedList;

public class Practice2 {
}

class LinkList{
    Node head;
    class Node {
        int data;
        Node next ;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //print list

    public void printList(){
        if (head == null)
            System.out.println("list is empty");
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> " );
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }


    //reverse iterative way
    public void reverseIterative(){

        if (head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currentNode = head.next;

        while (currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            //update
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    //reverse using recursion

    public Node reverseRecursion(Node head){
        if (head == null || head.next == null){
            return head;
        }
        //3 4
        Node newNode = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;

    }


    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        list.head =   list.reverseRecursion(list.head);
        System.out.println();
        list.printList();


    }
}
