package DS_ALGO.BinaryTree;

public class BinaryTree {
    Node root = null;

    public void insertDdata (int data) {
        if(root == null){
            root = new Node();
            root.data = data;
            System.out.println("ROOT Node added");
        }

    }


}
