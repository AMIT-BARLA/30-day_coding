// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class island {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            n obj = new n();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class n {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j =0; j <grid[0].length;j++){
                if(grid[i][j] == '1'){
                    count++;
                    fnc(grid,i,j);
                }
            }
        }
        return count;
    }
    public void fnc(char[][] grid, int i, int j){

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return;
        }
        if (grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        fnc(grid,i,j+1);
        fnc(grid,i,j-1);
        fnc(grid,i-1,j);
        fnc(grid,i+1,j);
        fnc(grid,i-1,j-1);
        fnc(grid,i+1,j-1);
        fnc(grid,i+1,j+1);
        fnc(grid,i-1,j+1);
    }
}