package DS_ALGO.LinkedList;

public class Index {
    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(7);
        node.next.next.next = new Node(11);

        System.out.println("The results are: ");
        Node temp = node;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(node);
    }
}
