import java.util.Scanner;

public class moveZeroToEnd {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        System.out.println("Enter the size of an array");
        int size = in.nextInt();
        System.out.println("Enter the elements in an array");
        int[] arr = new int[size];
        for(int i =0 ;i < arr.length;i++ ) arr[i] = in.nextInt();

        Solution obj = new Solution();
        obj.moveZerosToEnd(arr);
        for(int a: arr){
            System.out.print(a +" ");
        }
    }
}
class Solution {
    public void moveZerosToEnd(int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
    }
}
