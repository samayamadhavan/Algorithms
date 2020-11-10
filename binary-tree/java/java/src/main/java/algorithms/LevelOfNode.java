package algorithms;

public class LevelOfNode {
    

//int level = 0; 
    public int getLevel(Node root, int value){

      

        return getLevelHelper(root,value,1); 


        //return level; 
    }


    public int getLevelHelper(Node node, int val, int level) {
        if (node == null) {
        return -1;
        }
        if (node.data == val) {
        return level;
        }
        
        int lValue = getLevelHelper(node.left, val, level+1);
        
        if (lValue != -1) {
        return lValue;
        }
        
        int rValue = getLevelHelper(node.right, val, level+1);
        return rValue;
        }
        
}
