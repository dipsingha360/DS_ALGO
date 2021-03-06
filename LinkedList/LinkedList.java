package DS_ALGO.LinkedList;

public class LinkedList {

    Node head;

    // Data Insert
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null) {
            head = node;
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
    }

    //Data Insert At First
    public void insertAtFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    // Data Insert At Any Positions
    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0) {
            insertAtFirst(data);
        } else {
            Node tempNode = head;
            for(int i = 0; i<index-1; i++) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
    }

    // Data Deletion
    public void deleteAt(int index) {

        if(index == 0) {
            Node tempNode = head;
            head = tempNode.next;
        } else {
            Node temoNode = head;
            for(int i = 0; i<index-1; i++) {
                temoNode = temoNode.next;
            }
            temoNode.next = temoNode.next.next;
        }
    }

    // Data Print
    public void show() {
        Node tempNode = head;
        while(true) {
            System.out.println(tempNode.data);
            if(tempNode.next == null) break;
            tempNode = tempNode.next;

        }
    }



}
