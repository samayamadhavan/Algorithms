
package algorithms;
public class NumberOfNodes {
    
    public static int nodesCount(Node node){
if(node==null){
    return 0;
}
return 1 + nodesCount(node.left) + nodesCount(node.right);
    }
}
