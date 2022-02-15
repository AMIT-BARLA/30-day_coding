import java.util.HashMap;
import java.util.Scanner;

public class frequencies {
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

        System.out.println("Elements are:-");
        for (int i = 0; i < size1; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        frequenciesOfElement(array1);

    }


    public static void frequenciesOfElement(int[] arr){
        int feq= 1;
//        int currElement =arr[0];
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,2);
        hm.put(2,3);
        System.out.println(hm);
        int start ;
        for( start = 1; start < arr.length;start++){
            if (arr[start] == arr[start-1]){
                feq++;
                continue;
            }
            System.out.println(arr[start-1]+" "+feq);
            feq=1;
        }
        System.out.println(arr[start-1]+" "+feq);

    }
}
