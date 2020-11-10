
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


    //BinaryTree b = new BinaryTree();

    Node root2 = a.createNewNode(2);
    root2.right = a.createNewNode(7);
    root2.left = a.createNewNode(5);
    root2.right.right = a.createNewNode(2);
    root2.right.left = a.createNewNode(6);
    root2.right.left.right = a.createNewNode(5);
    root2.right.left.left = a.createNewNode(11);
    root2.left.left = a.createNewNode(9);
    root2.left.left.right = a.createNewNode(4);

   // System.out.print("Total Sum: " + SumOfAllNodes.getSumOfNodes(root));
  // System.out.print("Diff even and odd: " + DiffBetweenEvenAndOddLevel.evenOddLevel(root));
  //System.out.print("Nodes count: " + NumberOfNodes.nodesCount(root));
 // System.out.print("Leaf count: " + CountLeafNodes.leafCount(root));
 //HeightOfBinaryTree heightHelper = new HeightOfBinaryTree();
 //System.out.print("Height: " + heightHelper.getHeight(root));
   // PrintAtGivenLevel printAtLevel = new PrintAtGivenLevel();
   // printAtLevel.printAtLevel(root,2);
   //PrintLevelOrder printLevelOrder = new PrintLevelOrder();
   //printLevelOrder.levelOrderPrint(root);

   //PrintReverseLevelOrder reverseLevel = new PrintReverseLevelOrder();

//  reverseLevel.reverseLevelOrder(root);

//LevelOfNode levl = new LevelOfNode(); 
//System.out.print("Level of 11: " + levl.getLevel(root,11));


//TopViewTree top = new TopViewTree();
//top.printTopView(root);

//PrintBoundaryNodes printBoundry = new PrintBoundaryNodes();

// printBoundry.boundaryPrint(root);

//PrintVerticalOrder vo = new PrintVerticalOrder(); 
//vo.verticalPrint(root);

//LevelWiseSum lw = new LevelWiseSum();

//lw.levelSum(root);

//MaxWidthOfTree mW = new MaxWidthOfTree();

//System.out.println(mW.maxWidth(root));

//LevelOrderSpiral lS = new LevelOrderSpiral();

//lS.levelSpiral(root);

IfMirrorTree isMirror = new IfMirrorTree();

System.out.println(isMirror.isMirrorTree(root, root2));
  }

}