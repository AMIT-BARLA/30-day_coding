import java.util.Scanner;

public class twoD_arraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) arr[i][j] = in.nextInt();
        Complete obj = new Complete();
        int sum = obj.maximumSum(n,m,arr);
        System.out.println(sum);


    }

    static class Complete {


        // Function for finding maximum and value pair
        public int maximumSum(int n, int m, int[][] arr) {
            //Complete the function
            int sum = 0, prev = Integer.MAX_VALUE;
            for (int i = n - 1; i >= 0; i--) {
                int max = Integer.MIN_VALUE;
                for (int j = m - 1; j >= 0; j--) {
                    if (prev > arr[i][j]) {
                        max = Math.max(max, arr[i][j]);
                    }
                }
                if (max == Integer.MIN_VALUE) {
                    return 0;
                }
                sum += max;
                prev = max;
            }
            return sum;
        }
    }
}

