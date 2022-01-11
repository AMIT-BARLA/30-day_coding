import java.util.*;

public class minimumLightsToActivate_Day2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in Array");
        int si = in.nextInt();
        System.out.println("Enter the elements in ArrayList");
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i = 0; i < si; i++) {
            a1.add(i, in.nextInt());
        }
        System.out.println("Enter B");
        int B = in.nextInt();
        minimumLightsToActivate_Day2 obj = new minimumLightsToActivate_Day2();
        int minLightOn = obj.minimumLightsToActivate(a1, B);
        System.out.println(minLightOn);
    }

    public int minimumLightsToActivate(ArrayList<Integer> A, int B) {
        int count = 0;
        int right, left;
        int start;
        int end = A.size();
        start = 0;
        while (start < end) {
            right = Math.min(start + B - 1, A.size() - 1);
            left = Math.max(start - B + 1, 0);
            boolean bulbFound = false;
            while (right >= left) {
                if (A.get(right) == 1) {
                    bulbFound = true;
                    break;
                }
                right--;
            }
            if (!bulbFound) {
                return -1;
            }
            count++;
            start = right + B;
        }

        return count;
    }

}
