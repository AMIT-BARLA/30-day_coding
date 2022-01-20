import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numRows = in.nextInt();
        List<List<Integer>> a;

        a = generate(numRows);
        System.out.println(a);

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();

        List<Integer> row, prev = null;
        for(int i= 0 ; i < numRows; i++){
            row = new ArrayList<>();
            for(int j = 0; j <= i ; j++){
                if( j == 0 || j == i){
                    row.add(1);
                }
                else{
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev = row;
            al.add(row);
        }
        return al;
    }
}
