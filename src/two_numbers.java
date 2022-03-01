import java.util.HashMap;
import java.util.Scanner;

public class two_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i <N; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(countPairs(N,X,arr));

    }
    public static  long countPairs(int N, int X, int[] numbers)
    {
        // code here
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i : numbers){
            hm.put(Integer.toString(i),hm.getOrDefault(Integer.toString(i),0)+1);
        }
        String x = Integer.toString(X);
        long ans = 0;
        for( int i = 1; i < x.length(); i++){
            String f = x.substring(0,i);
            String s = x.substring(i);
            if (hm.containsKey(f) && hm.containsKey(s)) {
                if (f.equals(s)) ans += (long) hm.get(f) * (hm.get(s)- 1);
                else ans += (long) hm.get(f) * (hm.get(s));
            }
        }
    return ans;
    }
}
