import java.util.Scanner;

public class FindElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for(int i =0; i< n;i++){
            arr[i] = in.nextInt();
        }
        int[] a = findTwoElements(arr, n);
        System.out.println("The Elements are: "+a[0]+" "+a[1]);

    }
    public static int[] findTwoElements(int[] arr, int n){
        int[] result = new int[2];
        for(int i = 0; i < n; i++){
            int temp = Math.abs(arr[i]) - 1;
            if( arr[temp] < 0){
                result[0] = temp+1;
                // break;
            }
            else {
                arr[temp]*=-1;
            }
        }
        for(int i = 0 ; i < n ; i++){
            if (arr[i] > 0){
                result[1] = i+1;
                // break;
            }
        }
        return result;
    }
}
