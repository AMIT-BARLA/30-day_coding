import java.util.Scanner;

public class binToDec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        in.close();
        int length = str.length();
        System.out.println(length);
        int sum = 0;
        int i =0;
        while(length > 0){
            int c = str.charAt(length-1) - '0';
            System.out.println(c);
            int pow = (int) Math.pow(2,i);
            i++;
            sum+= c*pow;
            length--;
        }
        System.out.println(sum);
    }
}
