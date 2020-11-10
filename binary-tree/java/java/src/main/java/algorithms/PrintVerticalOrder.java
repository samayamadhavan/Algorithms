package algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PrintVerticalOrder {
    
    Map<Integer, List<Integer>> verticalList = new TreeMap<Integer,List<Integer>>();

    public void verticalPrint(Node node){
 
        populateVerticalList(node,0);
        System.out.println("number of vertical columns = " + verticalList.size());
        printVerticalList();


    }

    private void printVerticalList() {

        for(Integer currColumn : verticalList.keySet()){

            List<Integer> currColumnList  = verticalList.get(currColumn);

            System.out.println("number of items in column = " + currColumn + " items = " + currColumnList.size() );

            Iterator<Integer> itr = currColumnList.iterator();

            while(itr.hasNext()){
                System.out.print(itr.next());
            }

            System.out.println();
        }
    }

    private void populateVerticalList(Node node, int column) {

        if(node==null){
            return;
        }

        List<Integer> columnList = verticalList.getOrDefault(column, new ArrayList<Integer>());

        columnList.add(node.data);

        verticalList.put(column, columnList);

        populateVerticalList(node.left,column-1);
        populateVerticalList(node.right,column+1);
        
    }
}
