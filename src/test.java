//import java.util.*;
//
//public class test {
//    public static void main(String[] args) {
//        int[] a = {66,99,99};
//        countSpecials(a,3,2);
//        Stack<Integer> s = new Stack<>();
//
//    }
//    static void countSpecials(int a[], int n, int k){
//        int f = (int)Math.floor(n/k);
//        // your code here
//        int ans=0;
//        for(int i = 0 ; i < n ; i++){
//            int count = 0;
//            for(int j = 0 ; j < n ; j++){
//                if(a[i] == a[j]){
//                    ++count;
//                }
//            }
//            if(count == f){
//                ans++;
//                a[i] = -1;
//            }
//        }
//
//        System.out.print(ans);
//
//    }
//    class Compute
//    {
//        void sortBySetBitCount(Integer arr[], int n)
//        {
//            // Your code goes here
//            Arrays.sort(arr,new customSort());
//        }
//        static customSort implements Comparator<Integer>
//        {
//            public int compare(Integer a,Integer b){
//            int a1 = Integer.bitCount(a);
//            int b1 = Integer.bitCount(b);
//
//            return b1-a1;
//        }
//        }
//    }
//}
