import java.util.Scanner;

public class oneSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(countStrings(s));
    }
    public static long cal(long n){
        return (n*(n-1))>>1;
    }
    public static long countStrings(String S)
    {
        // code here
        int len = S.length();
        long ans = cal(len);
        int[] arr = new int[26];
        for (int i = 0 ; i < len; i++){
            arr[S.charAt(i) - 'a']++;
        }
        boolean val = false;
        for(int i = 0; i < 26; i++){
            if (arr[i] > 1){
                val = true;
                ans = ans - cal(arr[i]);
            }
        }
        return !val ? ans: (ans+1);
    }
}
