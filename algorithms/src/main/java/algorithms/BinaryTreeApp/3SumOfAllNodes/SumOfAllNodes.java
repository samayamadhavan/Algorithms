
package algorithms.BinaryTreeApp.BinaryTree.
import algorithms.BinaryTreeApp.BinaryTree.BinaryTreeNode;


public class SumOfAllNodes{

  public static int SumOfNodes(BinaryTreeNode node) {

    if (node == null) {
      return 0;
    }
    return node.val + SumOfNodes(node.left) + SumOfNodes(node.right);

  }

  public static void main(String[] args) {

    BinaryTreeNode root = new BinaryTreeNode(2);

    root.left = new BinaryTreeNode(7);
    root.right = new BinaryTreeNode(5);
    root.left.left = new BinaryTreeNode(2);
    root.left.right = new BinaryTreeNode(7);
    root.left.right.left = new BinaryTreeNode(5);
    root.left.right.right = new BinaryTreeNode(11);
    root.right.right = new BinaryTreeNode(9);
    root.right.right.left = new BinaryTreeNode(4);

    System.out.print("Total Sum: " + SumOfAllNodes.SumOfNodes(root));
}

}