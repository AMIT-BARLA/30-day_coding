import java.util.Scanner;

public class setMatrixZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = in.nextInt();
        System.out.println("Enter the column");
        int column = in.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        Solution3 obj = new Solution3();
        obj.setZeroes(arr);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
    class Solution3 {
        public void setZeroes(int[][] matrix) {
            int column = matrix[0].length;
            boolean col = false;
            for(int i = 0; i < matrix.length; i++){
                if( matrix[i][0] == 0){
                    col = true;
                }
                for(int j = 1; j < column; j++){
                    if(matrix[i][j] == 0){
                        matrix[0][j] = matrix[i][0] = 0;
                    }
                }
            }

            for(int i = matrix.length-1; i >=0; i--){
                for(int j = column-1; j >= 1; j--){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }

                }
                if(col){
                    matrix[i][0] = 0;
                }
            }

        }
    }

