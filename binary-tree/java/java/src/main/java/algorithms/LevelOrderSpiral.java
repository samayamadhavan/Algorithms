package algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LevelOrderSpiral {

    Map<Integer,List<Integer>> levelMap = new TreeMap<Integer,List<Integer>>();
    public void levelSpiral(Node root){

        populateLevelMap(root,1);
        printLevelMap();

    }

    private void printLevelMap() {

        for(Integer currLevel :levelMap.keySet() ){

            List<Integer> levelList = levelMap.get(currLevel);

            Iterator<Integer> itr = levelList.iterator();

            while(itr.hasNext()){

                System.out.print(itr.next() + " ");
            }

            System.out.println();
        }
    }

    private void populateLevelMap(Node root,int level) {
        if(root==null) return; 

        List<Integer> currentLevelList = levelMap.getOrDefault(level, new ArrayList<Integer>());
        if(level%2!=0){
            //odd level add left to right
            currentLevelList.add(root.data);
        }else{
            //even level add right to left
            currentLevelList.add(0,root.data);
        }
        levelMap.put(level, currentLevelList);


        populateLevelMap(root.left,level+1);
        populateLevelMap(root.right,level+1);
    }
}
