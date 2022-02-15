import java.io.*;
import java.util.*;

class nextPermutation{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String[] a = in.readLine().trim().split("\\s+");
            int[] arr = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);

            Sl ob = new Sl();
            List<Integer> ans;
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i)).append(" ");
            System.out.println(out);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Sl{

    public List<Integer> nextPermutation(int N, int[] arr){
        // code here

        int index1 = N-1;
        while(index1 > 0 && arr[index1] < arr[index1-1]) {
            index1--;
        }
        index1--;
        if (index1 > 0 ){
            int index2 = N-1;
            while (index2 > index1 && arr[index2] < arr[index1]){
                index2--;
            }
            swap(arr,index1,index2);
        }
        reverse(arr,index1+1,N-1);
        List<Integer> l1 = new ArrayList<>();
        for(int i = 0; i < N ; i++){
            l1.add(arr[i]);
        }
        return l1;

    }
    public static void swap(int[] arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    public static void reverse(int[] arr,int start,int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }




}