package linkedList;

public class LinkListtt {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode ;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    //print list
    public void print(){
        if (head == null){
            System.out.println("List is empty ..");
            return;
        }
        Node currenNode = head;
        while (currenNode != null){
            System.out.print(currenNode.data + "-> ");
            currenNode = currenNode.next;
        }
        System.out.print("null");
    }

    //delete first
    public void deleteFirst(int data){
        if (head == null){
            System.out.println("Empty LinkedList ....");
            return;
        }
        head = head.next;
    }
    //delete last
    public void deleteLast(int data){
        if (head == null){
            System.out.println("empty linkedList...");
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node secondNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondNode = secondNode.next;
        }
        secondNode.next = null;
    }

    public static void main(String[] args) {
        LinkListtt listtt = new LinkListtt();
        listtt.addFirst(2);
        listtt.addFirst(1);
        listtt.addLast(3);
        listtt.addLast(4);
        listtt.print();
    }

}
