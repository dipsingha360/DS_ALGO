package DS_ALGO.StackUsingLinkedList;

public class Stack {
    Node head;
    Node node = new Node();

    // Push Data
    public void push(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    // Pop Data
    public void pop() {
        if(head == null) {
            System.out.println("\n STACK IS EMPTY");
        } else {
            Node tempNode = head;
            head = tempNode.next;
        }
    }

    // Print Data
    public void show() {
        if(head == null) {
            System.out.println("\n STACK IS EMPTY");
        } else {
            Node tempNode = head;
            while(true) {
                System.out.println(tempNode.data);
                if(tempNode.next == null) break;
                tempNode = tempNode.next;

            }
        }
    }
}
