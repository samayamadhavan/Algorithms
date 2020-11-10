package algorithms;

public class IfMirrorTree {
    
    public boolean isMirrorTree(Node root1,Node root2){

        if(root1==null && root2==null) return true;

        if(root1==null || root2==null) return false;

        return root1.data==root2.data && isMirrorTree(root1.left, root2.right) && isMirrorTree(root1.right, root2.left);
    }
}
