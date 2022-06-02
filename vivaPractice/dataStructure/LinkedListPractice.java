package vivaPractice.dataStructure;

public class LinkedListPractice {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }

    }
    //add first last
   void addFirst(String data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
   }
   //add Last
   void addLast(String data){
       Node newNode = new Node(data);
       if (head==null){
           head = newNode;
           return;
       }
       Node currentNode = head;
       while (currentNode.next != null){
           currentNode = currentNode.next;
       }
       currentNode.next = newNode;
   }

   //print
    void printList(){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }



    public static void main(String[] args) {
        LinkedListPractice list = new LinkedListPractice();
        list.addFirst("tuhin");
        list.addFirst("Tethye");
        list.addFirst("Tamim");
        list.printList();
    }
}
