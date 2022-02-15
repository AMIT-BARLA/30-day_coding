import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class handshake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(count(n));
    }
    public static int count(int N)
        {
            // code here
            BigInteger A = BigInteger.valueOf(0);
            HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
            hm.put(0,1);
            int val = 0;
            for(int i = 2; i <= N; i+=2){
                for(int j = 0; j <= i-2; j+=2){
                    val += hm.get(j)*hm.get(i-j-2);
                    hm.put(i,val);

                }
                val =0;
            }
//            hm.
            return hm.get(N);
        }

}
