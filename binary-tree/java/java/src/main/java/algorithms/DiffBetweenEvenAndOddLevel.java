package algorithms;

public class DiffBetweenEvenAndOddLevel {
    
    public static int evenOddLevel(Node n){
        if(n==null) return 0; 

        return n.data - evenOddLevel(n.left) - evenOddLevel(n.right);
    }
}
