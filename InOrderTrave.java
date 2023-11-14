package codingQue;
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class InOrderTrave {
    TreeNode root;

    public InOrderTrave() {
        root = null;
    }


    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
      
            inOrderTraversal(node.left);

            
            System.out.print(node.data + " ");


            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        InOrderTrave tree = new InOrderTrave();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("In-order traversal of the binary tree:");
        tree.inOrderTraversal(tree.root);
    }
}
