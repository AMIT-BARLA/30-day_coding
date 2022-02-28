import java.util.HashMap;
import java.util.Scanner;

public class hitBalloons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N][2];
        for( int i = 0 ; i < N; i ++){
            for(int j = 0 ; j < 2; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(mostBalloons(N,arr));
    }
    public static int mostBalloons(int N, int[][] arr) {
        // Code here
        int result = 0;
        for ( int i = 0; i < N; i++ ){
            int x1 = arr[i][0];
            int y1 = arr[i][1];
            HashMap<Double,Integer> hm = new HashMap<>();
            int count = 0;
            for( int j =0; j < N; j++ ){
                int x2 = arr[j][0];
                int y2 = arr[j][1];
                if ( x1 == x2 && y1 == y2){
                    count++;
                    continue;
                }
                double slope = ((double)(y2-y1)/(double)(x2-x1));
                hm.put(slope,hm.getOrDefault(slope,0)+1);
            }
            for ( double x : hm.keySet()){
                result = Math.max(result,count+hm.get(x));
            }

        }
        return result;
    }
}
