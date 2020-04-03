package BinaryTree;

class BinaryTreeNode{

    int val; 
    BinaryTreeNode left; 
    BinaryTreeNode right; 

    public BinaryTreeNode(int val){
        this.val = val; 
        this.left = null;
        this.right = null;
    }
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(4); 
        root.left = new BinaryTreeNode(5);
        root.right = new BinaryTreeNode(6);


    }
}