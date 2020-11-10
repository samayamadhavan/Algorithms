package algorithms;

public class MaxWidthOfTree {
    
   Integer minWidthVal = Integer.MAX_VALUE; 

   Integer maxWidthVal = Integer.MIN_VALUE;
    public int maxWidth(Node node){

        if(node==null) return 0; 

        maxWidthHelper(node,0); 

        return Math.abs(minWidthVal) + maxWidthVal + 1; 
        
 
    }

    private void maxWidthHelper(Node node, int column) {
        if(node==null) return; 

   
        if(column<minWidthVal) minWidthVal = column; 
        if(column>maxWidthVal) maxWidthVal = column;

        maxWidthHelper(node.left,column-1);
        maxWidthHelper(node.right,column+1);

    }
}
