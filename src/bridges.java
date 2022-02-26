import java.util.Arrays;
import java.util.Scanner;

public class bridges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(build_bridges(s1,s2));
    }
    public static int build_bridges(String str1 , String str2)
    {
        // code here
        int n1 = str1.length();
        int n2 = str2.length();
        int [][] arr = new int[n1+1][n2+1];
        for( int[] row : arr){
            Arrays.fill(row,0);
        }
        for(int i =1; i<=n1; i++){
            for(int j = 1; j <= n2; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    arr[i][j] = 1+ arr[i-1][j-1];
                } else {
                    arr[i][j] = (int)Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        return arr[n1][n2];
    }
}
