
import java.util.ArrayList;
import java.util.List;

import algorithms.BinaryTreeApp.BinaryTree.BinaryTreeNode;

 class PrintPathWhereSumEqualsValueHelper{
        List<Integer> path = new ArrayList<Integer>();

        public void printPathEqualsSum(BinaryTreeNode node, int val){
                if (node == null){ return; }
                path.add(node.val);

                printPathEqualsSum(node.left, val);
                printPathEqualsSum(node.right,val);
                int sum = 0;
                for(int i= path.size()-1; i>=0; i--){
                        sum = sum + path.get(i);
                        if(sum == val){
                                for(int j = i ; j<path.size(); j++){
                                        System.out.print(path.get(j)+ " ");
                                }
                                System.out.println();
                        }
                }

                path.remove(path.size()-1);

        }
}

public class PrintPathWhereSumEqualsValue{
        public static void main(String[] args) {
            BinaryTreeNode a = new BinaryTreeNode(2);
            a.left = new BinaryTreeNode(4);
            a.left.left = new BinaryTreeNode(1);
            a.left.right = new BinaryTreeNode(6);
            a.right = new BinaryTreeNode(5);
            a.right.right = new BinaryTreeNode(7);
            PrintPathWhereSumEqualsValueHelper helper  = new PrintPathWhereSumEqualsValueHelper();
            helper.printPathEqualsSum(a,6);




        }
}