package algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintBoundaryNodes {
    
    List<Integer> leafList = new ArrayList<Integer>();
    List<Integer> leftList = new ArrayList<Integer>();
    List<Integer> rightList = new ArrayList<Integer>();
    public void boundaryPrint(Node node){
        System.out.print(node.data + " ");
        leftBoundaryPrint(node.left); 
        printLeaf(node);
        rightBoundaryPrint(node.right);
        printLists();
    }

    private void printLists() {

        Iterator<Integer> itr = leftList.iterator();

        while(itr.hasNext()){
            //int ans +=
            System.out.print(itr.next() + " ");
        }
        Iterator<Integer> itr2 = leafList.iterator();

        while(itr2.hasNext()){
            System.out.print(itr2.next() + " ");
        }
        Iterator<Integer> itr3 = rightList.iterator();

        while(itr3.hasNext()){
            System.out.print(itr3.next() + " ");
        }


    }

    private void rightBoundaryPrint(Node node) {
        if(node==null) return; 
        if(node.left==null && node.right==null) {
            
            return;
        }
        rightList.add(0,node.data);

        if(node.right!=null){
            rightBoundaryPrint(node.right);
        }else if(node.left!=null){
            rightBoundaryPrint(node.left);
        }


    }

    private void printLeaf(Node node) {

        if(node==null) return; 

        printLeaf(node.left);

        if(node.left==null && node.right==null){
            leafList.add(node.data);
        }

        printLeaf(node.right);

    }

    private void leftBoundaryPrint(Node node) {
        if(node==null) return; 
        if(node.left==null && node.right==null) {
            
            return;
        }
        leftList.add(node.data);

        if(node.left!=null){
            leftBoundaryPrint(node.left);
        }else if(node.right!=null){
            leftBoundaryPrint(node.right);
        }
    }
}
