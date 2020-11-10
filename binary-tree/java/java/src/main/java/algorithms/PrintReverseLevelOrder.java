package algorithms;

public class PrintReverseLevelOrder {
    


    public void reverseLevelOrder(Node root){

        int height = getHeight(root);
        
        for(int i =height; i>0; i--){
            printAtGivenLevel(root,i);
            System.out.println();
        }

    }

    private int getHeight(Node root){

        if(root==null){
            return 0;
        }

        return Math.max(getHeight(root.left), getHeight(root.right) )+1  ;

    }

    private void printAtGivenLevel(Node node, int level){

        if(node==null){
            return; 
        }
        if(level==1){
            System.out.print(node.data + " ");
            return;
        }
        printAtGivenLevel(node.left, level-1);
        printAtGivenLevel(node.right, level-1);

    }
}
