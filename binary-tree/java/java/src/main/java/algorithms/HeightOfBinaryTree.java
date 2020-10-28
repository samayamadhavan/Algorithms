package algorithms;

public class HeightOfBinaryTree {
    static int height = Integer.MIN_VALUE;

   public static int getHeight(Node node){
           // if(node==null) return -1;

       // return Math.max(getHeight(node.left),getHeight(node.right)) + 1  ;
     
       return getHeightHelper(node);
    }
    
    public static int getHeightHelper(Node node){

        if(node==null) return 0; 
        
        int tempHeight = 1+ Math.max(getHeightHelper(node.left), getHeightHelper(node.right));
        height = Math.max(height, tempHeight);

        return height;
    }
    
}

////

