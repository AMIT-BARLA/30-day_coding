import java.util.Scanner;

public class rearrange_a_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        sol obj = new sol();
        System.out.println(obj.rearrange(s));

    }

}
class sol {
    public String rearrange(String s) {
        int[] arr = new int[26];
        int sum = 0;
        int t;
        for (int i = 0; i < s.length(); i++) {
            t = s.charAt(i);
            if(t >= 65 && t <= 90){
                arr[t-65] +=1;
            }else {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        StringBuilder s1 = new StringBuilder();
        int i= 65;
        for(int a : arr){
            while (a >= 1){
                s1.append((char) i);
                --a;
            }
            ++i;
        }


        return s1.toString() +sum;
    }
}

