
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair{

    int x,y;
    Pair(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}

public class Spidey_sense {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        char[][] mat = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.next().charAt(0);
            }
        }
        int[][] ans = result.findDistance(mat, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    class result {
        public static int[][] findDistance(char[][] mat, int m, int n) {
            // Your code goes here
            int[][] ans = new int[m][n];
            Queue<Pair> q = new LinkedList<>();
            for (int i = 0; i < m ; i++ ){
                for( int j = 0 ; j < n ; j++){
                    if (mat[i][j] == 'B'){
                        ans[i][j] = 0;
                        q.add(new Pair(i,j));
                    } else {
                        ans[i][j] = -1;
                    }
                }
            }
            while(q.size() > 0){
                    int s = q.size();
                    while (s > 0){
                        Pair p = q.peek();
                        assert p != null;
                        int i = p.x;
                        int j = p.y;
                        q.remove();
                        if ( i-1 >= 0 && mat[i-1][j] == 'O' && ans[i-1][j] == -1){
                            ans[i-1][j] = 1+ ans[i][j];
                            q.add(new Pair(i-1,j));
                        }
                        if (j-1 >= 0 && mat[i][j-1] == 'O' && ans[i][j-1] == -1){
                            ans[i][j-1] = 1 + ans[i][j];
                            q.add(new Pair(i,j-1));
                        }
                        if ( j+1 < n && mat[i][j+1] == 'O' && ans[i][j+1] == -1){
                            ans[i][j+1] = 1+ ans[i][j];
                            q.add(new Pair(i,j+1));
                        }
                        if ( i+1 < m && mat[i+1][j] == 'O' && ans[i+1][j] == -1){
                            ans[i+1][j] = 1+ ans[i][j];
                            q.add(new Pair(i+1,j));
                        }
                        s--;
                    }
            }
           return ans;
        }

    }

