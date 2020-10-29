package algorithms;


public class PrintAtGivenLevel{

//Binary Tree - Print elements at given level in Binary Tree
    public void printAtLevel(Node node, int level){
        //caluclate current height
        //if currentHeight == level -> print node and then return

        printAtLevelHelper(node,1,level);

    }

    public void printAtLevelHelper(Node node, int currentHeight, int level){
        if(node==null){
            return;
        }
        if(currentHeight==level){
            System.out.println(node.data);
            return;
        }
        //currentHeight++;

        printAtLevelHelper(node.left,currentHeight+1,level);
        printAtLevelHelper(node.right,currentHeight+1,level);
    }
}