import java.util.Scanner;

public class smallestWindow012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s =  in.nextLine();
        System.out.println(smallestSubstring(s));
    }
    public static  int smallestSubstring(String s) {
        // Code here
        int z=-1,o=-1,t=-1;
        int ans = Integer.MAX_VALUE;
        for( int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0') z = i;
            else if (s.charAt(i) == '1') o = i;
            else if (s.charAt(i) == '2') t = i;
            if( z != -1 && o != -1 && t != -1 ){
                int max = Math.max(z,Math.max(o,t));
                int min = Math.min(z,Math.min(o,t));
                ans = Math.min(ans,max-min);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans+1;
    }
}
