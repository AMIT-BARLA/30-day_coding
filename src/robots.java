import java.util.Scanner;

public class robots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(robot(s1,s2));

    }
    public static String robot(String s1, String s2){
        int i=0,j = 0;
        int n = s1.length();
        while( i < n && j < n){
            if (s1.charAt(i) == '#') {
                i++;
            }
            else if (s2.charAt(j) == '#') {
                j++;
            }
            else if (s1.charAt(i) != s2.charAt(j) ){
                return "No";

            }
            else if (s1.charAt(i) == 'B' && i > j) return "No";
            else if (s1.charAt(i) == 'A' && i < j) return "No";
            else {
                i++;
                j++;
            }

        }
        return "Yes";
    }
}
//#B#A#
//##BA#