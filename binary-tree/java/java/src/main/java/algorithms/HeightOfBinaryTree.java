package algorithms;

public class HeightOfBinaryTree {
   // static int height = Integer.MIN_VALUE;

   public static int getHeight(Node node){
        if(node==null) return 0;

        return Math.max(getHeight(node.left),getHeight(node.right)) + 1  ;
     
        //return getHeightHelper(node,0);
        //return height; 
    }
    
   /* public static int getHeightHelper(Node node, Integer height){

        if(node==null) {
            return 0; 
        }

        int tempHeight = 1+ Math.max(getHeightHelper(node.left,height), getHeightHelper(node.right,height));
        height = Math.max(height, tempHeight);
        return height;

    }*/

   /* public class HeightOfBinaryTree {
         int height = Integer.MIN_VALUE;
        
        public  int getHeight(Node node){
         return getHeightHelper(node);
        // return height;
        }
        
        public  int getHeightHelper(Node node){
        if(node==null) {
        return 0;
        }
        
        int tempHeight = 1+ Math.max(getHeightHelper(node.left), getHeightHelper(node.right));
       // height = Math.max(height, tempHeight);
        
        return tempHeight;
        }*/
        
    
}



