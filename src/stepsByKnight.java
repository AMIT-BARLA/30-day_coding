import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class stepsByKnight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] knightPos = new int[2];
        int[] targetPos = new int[2];
        knightPos[0] = in.nextInt();
        knightPos[1] = in.nextInt();
        targetPos[0] = in.nextInt();
        targetPos[1] = in.nextInt();

        System.out.println(minStepToReachTarget(knightPos,targetPos,N));

    }
    public static int minStepToReachTarget(int[] KnightPos, int[] TargetPos, int N)
    {
        // Code here
        int startX = KnightPos[0] - 1;
        int startY = KnightPos[1] - 1;
        int targetX = TargetPos[0] -1;
        int targetY = TargetPos[1]-1;
        Queue<Pair> q = new LinkedList<>();
        boolean[][] visitedPos = new boolean[N][N];
        q.add(new Pair(startX,startY));
        visitedPos[startX][startY] = true;
        int steps = 0;
        int[][] dir ={{1,2},{-1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,1},{-2,-1}};
        while(!q.isEmpty()){
            int z =q.size();
            for(int i = 0; i < z; i++){
                Pair p = q.poll();
                assert p != null;
                int x = p.first;
                int y = p.second;
                if( x == targetX && y == targetY){
                    return steps;
                }
                for (int[] ints : dir) {
                    int x1 = x + ints[0];
                    int y1 = y + ints[1];
                    if (valid(x1, y1, N) && !visitedPos[x1][y1]) {
                        visitedPos[x1][y1] = true;
                        q.add(new Pair(x1, y1));
                    }
                }
            }
            steps++;
        }
        return steps;
    }

    static class Pair {
        int first;
        int second;
        Pair(int a, int b){
            first = a;
            second = b;
        }
    }
    static boolean valid(int x,int y,int n){
        return x < n && x >= 0 && y < n && y >= 0;
    }
}


