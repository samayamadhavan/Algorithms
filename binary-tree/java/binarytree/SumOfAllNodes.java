public class SumOfAllNodes {
      /*
   * It'll return sum of all nodes in Binary Tree
   */
  public static int getSumOfNodes(Node node) {
    if (node == null) {
      return 0;
    }

   return node.data + getSumOfNodes(node.left) + getSumOfNodes(node.right);
  }
}
