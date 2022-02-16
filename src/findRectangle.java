import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class findRectangle {
    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 0, 1, 0 },
                { 0, 0, 1, 0, 1 },
                { 0, 0, 0, 1, 0 },
                { 1, 0, 1, 0, 1 } };
        if (ValidCorner(mat))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
    static boolean ValidCorner(int[][] matrix)
    {
        // Your code goes here
        HashSet<HashMap<Integer,Integer>> h =  new HashSet<>();
        for(int i=0;i<matrix[0].length;i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]==1){
                    for(int k=0;k<a.size();k++){
                        HashMap<Integer,Integer> p= new HashMap<>();
                        p.put(a.get(0),j);
                        if(h.contains(p))
                            return true;
                        else
                            h.add(p);
                    }
                    a.add(j);
                }

            }
        }
        return false;
    }
}
