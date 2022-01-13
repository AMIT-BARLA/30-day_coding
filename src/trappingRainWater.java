
import java.util.Scanner;

public class trappingRainWater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        int i=0;
        while (i < size) {
            arr[i] = in.nextInt();
            i++;
        }
//        System.out.println(a);
        int output = trappingRainWater1(arr);
        System.out.println(output);
    }
    public static int trappingRainWater1(int[] height){
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = height[0];
        for(int i =1;i <height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i >=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        int res = 0;
        for(int i = 0; i < height.length; i++){
            res = res + Math.min(leftMax[i],rightMax[i]) - height[i];
        }
        return res;
    }
}
