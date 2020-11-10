package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TopViewTree {

 Map<Integer,List<Integer>> topViewMap = new TreeMap<Integer,List<Integer>>();
public void printTopView(Node root){


    printTopViewHelper(root,0,1);

    printMap();

}

private void printMap(){


  for(Integer key : topViewMap.keySet()){
    System.out.print(topViewMap.get(key).get(1) + " ");
  }
}

private void printTopViewHelper(Node node,int column,int height){

    if(node==null) return; 

  printTopViewHelper(node.left, column-1,height+1);

  List<Integer> heightAndValue = topViewMap.getOrDefault(column,new ArrayList<Integer>());

  if(heightAndValue.size()==2){
    //get current value and compare to height
    int prevHeight = heightAndValue.get(0);
    if(prevHeight>height){
      heightAndValue.clear();
      heightAndValue.add(height);
      heightAndValue.add(node.data);

    }
  }else{
    heightAndValue.add(height);
    heightAndValue.add(node.data);
  }
  topViewMap.put(column, heightAndValue);

  printTopViewHelper(node.right,column+1,height+1);


  
}

}


