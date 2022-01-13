import java.util.*;
public class maximumTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int len = in.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i = 0; i < len; i++){
            a1.add(i, in.nextInt());
        }
        int max = maxTriplet(a1);
        System.out.println(max);
    }
    public static int maxTriplet(ArrayList<Integer> a){
        int[] arr = new int[a.size()];
        System.out.println("length ="+arr.length);
        int right = a.size()-2;
        int currMax = a.get(a.size()-1);
        arr[a.size()-1] = currMax;
        while(right >= 0){
            if (a.get(right) >= currMax ){
                currMax = a.get((right));
                arr[right]= currMax;
            }
            arr[right]= currMax;
            right--;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        for(int i = 0; i< a.size();i++){
            int val = a.get(i);

        }

        return 1;
    }
}
