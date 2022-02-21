import java.io.*;
import java.util.*;

class optimalBST{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int keys[]= new int[n];
            for(int i = 0; i < n; i++)
                keys[i] = Integer.parseInt(input_line[i]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int freq[]= new int[n];
            for(int i = 0; i < n; i++)
                freq[i] = Integer.parseInt(input_line1[i]);
            o ob = new o();
            System.out.println(ob.optimalSearchTree(keys, freq, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class o
{
    static int[][] arr = new int[101][101];
    static int optimalSearchTree(int keys[], int freq[], int n)
    {
        // code here
        for( int[] row : arr){
            Arrays.fill(row,-1);
        }
        return cost(0,n-1,freq);
    }

    public static int cost(int i, int j, int[] freq){
        if ( i > j) return 0;
        if ( i == j ) return arr[i][j] = freq[i];
        if (arr[i][j] != -1 ) return arr[i][j];

        int w = sumfreq(i,j,freq);
        int ans = Integer.MAX_VALUE;
        for( int k = i ; k <= j; k++){
            int temp = cost(i,k-1,freq) + cost(k+1,j,freq);
            ans = Math.min(ans,temp);
        }
        return arr[i][j] =ans+w;
    }
    public static int sumfreq(int i , int j, int[] freq){
        int sum = 0;
        for(int k = i; k <= j; k++){
            sum+= freq[k];
        }
        return sum;
    }
}
