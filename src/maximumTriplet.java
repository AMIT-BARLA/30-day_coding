import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

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
        System.out.println("max = "+max);
    }
    public static int maxTriplet(ArrayList<Integer> a){

        ArrayList<Integer> rightMax = new ArrayList<>();
        int end = a.size()-2;
        rightMax.add(0,a.get((a.size()-1)));
        while(end >0){
            System.out.println("rightMax = "+rightMax.get(0)+"end="+end +"A end ="+a.get(end));
            if(rightMax.get(0) < a.get(end)){
                rightMax.add(0,a.get(end));
            } else {
                rightMax.add(0, rightMax.get(0));
            }
            end--;
        }
        System.out.println(rightMax);
        Stack<Integer> s = new Stack<>();
        end = a.size()-1;
        while(end >=0){
            s.push(a.get(end));
            end--;
        }
        System.out.println(s);
        end = a.size()-1;
        int start;
        int currSum = 0;
        int currIndex = 0;
        while(!s.isEmpty()) {
            start = currIndex;
            while (start < end) {
                int top = s.peek();
                if (top < a.get(start + 1) && a.get(start + 1) < rightMax.get(start)) {
                    currSum = Math.max(top + a.get(start + 1) + rightMax.get(start), currSum);
                }
                start++;
            }
            currIndex++;
            s.pop();
        }
        return currSum;
    }
    //21882, 31999, 10323, 18652, 10022, 5700, 3558, 28477, 27893, 24390, 5076, 10713, 2601, 2511, 21004, 26870
    //73142
}
