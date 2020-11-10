package algorithms;

import java.util.Map;
import java.util.TreeMap;

public class LevelWiseSum {
    
Map<Integer,Integer> levelSumMap = new TreeMap<Integer,Integer>();

    public void levelSum(Node node){

        populateMap(node,1);
        printMap();
        

    }

    private void printMap() {

        for(Integer level : levelSumMap.keySet()){
            System.out.println(levelSumMap.get(level));
        }
      
    }

    private void populateMap(Node node, int level) {

        if(node==null){
            return;
        }
        int levelSum = levelSumMap.getOrDefault(level, 0) + node.data;
        levelSumMap.put(level, levelSum); 

        populateMap(node.left,level+1);
        populateMap(node.right,level+1);


    }
}
