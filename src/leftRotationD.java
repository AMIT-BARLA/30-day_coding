
import java.util.Scanner;

public class leftRotationD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size1 = in.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < size1; i++) {
            array1[i] = in.nextInt();
        }
        System.out.println();
        System.out.println("Enter the D rotation");
        int d = in.nextInt();
        System.out.println("Elements are:-");
        for (int i = 0; i < size1; i++) {
            System.out.print(array1[i] + " ");
        }
        lRotation(array1,d);
        System.out.println("After Rotation ...");
        for(int i =0; i< size1; i++){
            System.out.print(array1[i]+" ");
        }
    }
    public static void lRotation(int[] arr,int d){
        reverseArray(arr,0,d-1);
        reverseArray(arr, d,arr.length-1);
        reverseArray(arr,0,arr.length-1);

    }
    public static void reverseArray(int[] arr,int low,int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high]= temp;
            low++;
            high--;
        }
    }
}