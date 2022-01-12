import java.util.*;

public class addOneToNumber_Day1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Enter the size of an Array");
        int size = in.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            a.add(in.nextInt());
        }
        addOneToNumber_Day1 obj = new addOneToNumber_Day1();
        obj.plusOne(a);
        System.out.println(a);
    }
    public void plusOne(ArrayList<Integer> A) {
        // Check if index at '0' has a value 0.
        while(A.size() > 1 && A.get(0) == 0){
            A.remove(0);
        }
        int rem = 0;
        for(int i = A.size()-1; i>=0; i--){
            int num = A.get(i);
            A.remove(i);
            if(num == 9){
                A.add(i,0); // removing the 9 and adding 0 at this place.
                rem = 1 ;
            }
            else{
                A.add(i,num+1);
                rem = 0;
                break;
            }
        }
        if( rem == 1){ // example:- 9999 So, all will become '0' and 1 will be added in the index '0'
            A.add(0,1);
        }

    }
}
