package DS_ALGO.LinkedList;

public class LinkedList {

    // Data Insert
    Node head;
    public void insert (int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    //Data Insert At First
    public void indertAtFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    // Data Print
    public void show() {
        Node node = head;
        while(true) {
            System.out.println(node.data);
            if(node.next == null) break;
            node = node.next;

        }
    }



}
