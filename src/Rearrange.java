import java.io.*;
import java.util.*;
class Rearrange{
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());

            String input_line[] = read.readLine().trim().split("\\s+");
            long a[]= new long[n];
            for(int i = 0; i < n; i++)
                a[i] = Long.parseLong(input_line[i]);

            S ob = new S();
            ob.prank(a, n);

            for (int i=0;i<n;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
} // } Driver Code Ends


//User function Template for Java
class S
{
    void prank(long[] a, int n)
    {
        // code here
        for(int i = 0 ; i< n; i++){

            a[i]+=(a[(int)a[i]]%n)*n;
        }
        for(int i =0; i <n; i++){
            a[i] /=n;
        }
    }
}