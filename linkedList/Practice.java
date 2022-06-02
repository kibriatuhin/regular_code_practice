package linkedList;

 class PracticeLinkedList {
    Node head;
    class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next = null;
        }

    }

    //add fast
    void addFast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
   }

   // add last
    void addLast(String data){

        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        //traverse
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    //delete fast
     void deleteFast(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
     }

    //print data
     void printData(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }

         Node currentNode = head;
         while (currentNode != null){
             System.out.print(currentNode.data + "-> ");
             currentNode = currentNode.next;
         }
         System.out.println("null");
     }


    public static void main(String[] args) {
        PracticeLinkedList linkedList = new PracticeLinkedList();
        linkedList.addFast("tuhin");
        linkedList.addFast("tamim");

        linkedList.printData();
        System.out.println("before call addlast");
        linkedList.addLast("tethye");
        linkedList.printData();
        linkedList.deleteFast();
        linkedList.printData();



    }
}
