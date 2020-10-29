
package algorithms;

class Node {
  Node left;
  Node right;
  int data;
}

class BinaryTree {
  public Node createNewNode(int val) {
    Node newNode = new Node();
    newNode.data = val;
    newNode.left = null;
    newNode.right = null;
    return newNode;
  }
}

public class BinaryTreeApp {

  public static void main(String[] args) {

    BinaryTree a = new BinaryTree();

    Node root = a.createNewNode(2);
    root.left = a.createNewNode(7);
    root.right = a.createNewNode(5);
    root.left.left = a.createNewNode(2);
    root.left.right = a.createNewNode(6);
    root.left.right.left = a.createNewNode(5);
    root.left.right.right = a.createNewNode(11);
    root.right.right = a.createNewNode(9);
    root.right.right.left = a.createNewNode(4);

   // System.out.print("Total Sum: " + SumOfAllNodes.getSumOfNodes(root));
  // System.out.print("Diff even and odd: " + DiffBetweenEvenAndOddLevel.evenOddLevel(root));
  //System.out.print("Nodes count: " + NumberOfNodes.nodesCount(root));
 // System.out.print("Leaf count: " + CountLeafNodes.leafCount(root));
 //HeightOfBinaryTree heightHelper = new HeightOfBinaryTree();
 //System.out.print("Height: " + heightHelper.getHeight(root));
   // PrintAtGivenLevel printAtLevel = new PrintAtGivenLevel();
   // printAtLevel.printAtLevel(root,2);
   PrintLevelOrder printLevelOrder = new PrintLevelOrder();
   printLevelOrder.levelOrderPrint(root);
  }

}