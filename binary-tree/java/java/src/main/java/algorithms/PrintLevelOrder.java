package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PrintLevelOrder {
    
    Map<Integer,List<Integer>> nodeMap = new TreeMap<Integer,List<Integer>>();

    public void levelOrderPrint(Node node){

        levelOrderPopulateMap(node,1);
        printFromMap();
    }

    private void levelOrderPopulateMap(Node node, int currentLevel){
        if(node==null){
            return;
        }
        
        List<Integer> currentList = nodeMap.getOrDefault(currentLevel, new ArrayList<Integer>());
        currentList.add(node.data);
        nodeMap.put(currentLevel,currentList);
        levelOrderPopulateMap(node.left, currentLevel+1);
        levelOrderPopulateMap(node.right, currentLevel+1);
      
    }

    private void printFromMap(){

       // Iterator itr = nodeMap.iterator();
        
       Set<Integer> keySet = nodeMap.keySet();

       for (Integer key : keySet) {
           List<Integer> currList = nodeMap.get(key);

           Iterator<Integer> itr = currList.iterator();

           while(itr.hasNext()){
               System.out.print(itr.next()+ " ");
           }
           System.out.println(" ");
       }
    }
}
