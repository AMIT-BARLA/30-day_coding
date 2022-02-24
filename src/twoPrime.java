import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class twoPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> l;
        l = primeDivision(n);
        for ( int i = 0; i < l.size(); i++){
            System.out.print(l.get(i)+" ");
        }
    }
    public static List<Integer> primeDivision(int N){
        // code here
        List<Integer> l1 = new ArrayList<>();
        boolean[] arr = new boolean[N+1];
        Arrays.fill(arr,false);
        for( int i = 0 ; i <= N ; i++){
            if (checkPrime(i)) arr[i] = true;
        }
        for(int i = 2 ; i < N; i++){
            if ( arr[i] && arr[N-i]) {
                l1.add(i);
                l1.add(N-i);
                return l1;
            }
        }
        return l1 ;
    }

    public static boolean checkPrime(int n){
        if (n <= 1) return false;
        if ( n == 2 || n == 3) return true;
        if ( n%2 == 0 || n%3 == 0) return false;
        // if ( n%5 == 0) return false;
        for(int i = 5; i*i <= n ; i +=6){
            if(n%i == 0 || n % (i+2) == 0 ){
                return false;
            }
        }
        return true;
    }
}
