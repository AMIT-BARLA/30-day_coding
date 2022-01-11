import java.util.*;
public class secondLargestElement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size1 = in.nextInt();
        int[] array1= new int[size1];
        System.out.println("Enter the elements of an array");
        for(int i =0; i< size1; i++){
            array1[i]= in.nextInt();
        }
        System.out.println("Elements are:-");
        for(int i =0; i< size1; i++){
            System.out.print(array1[i]+" ");
        }
        secondLargestElement obj = new secondLargestElement();
        System.out.println();
        int index = obj.secondLargest(array1);
        System.out.println("Second Largest element is:"+array1[index]);

    }
    public int secondLargest(int[] arr){
        int largest = 0;
        int result = -1;
        for(int start =1; start<arr.length;start++){
            if(arr[start] > arr[largest]){
                result = largest;
                largest = start;

            }
            else if (arr[start] != arr[largest]){
                if(result == -1 || arr[start] > arr[result]){
                    result = start;
                }
            }
        }
        return result;
    }
}
