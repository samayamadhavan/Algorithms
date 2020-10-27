

public class CountLeafNodes {
    
    public static int leafCount(Node node){
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return 1; 
        }
        return leafCount(node.left) + leafCount(node.right);
    }
}

