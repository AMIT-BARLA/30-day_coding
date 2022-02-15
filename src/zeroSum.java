import java.util.*;

public class zeroSum {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int size = in.nextInt();
//        int[] arr = new int[size];
//        for(int i = 0; i < size; i++){
//            arr[i] = in.nextInt();
//        }
//        System.out.println(sbWithZeroSum(size,arr));
//        System.out.println(sbwithKsum(0,arr));
//        System.out.println(sbWithZeroSum1(arr,0));
//          System.out.println(lswzo(arr));
        Queue<Integer> q = new LinkedList<>();

        String S = "i.like.this.program.very.much";
        String temp = "";
        int len = S.length();
        int last = len;
        for(int i = len-1; i >=0; i--){
            if(S.charAt(i) == '.'){
                temp = temp + S.substring(i + 1, last);
                temp+='.';
                last = i;
            }
        }
        temp+= S.substring(0,last);
        System.out.println(temp);

    }
    static int sbWithZeroSum(int n, int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(0);
        int count = 0;
        int sum= 0;
        for(int i =0; i < n; i++){
            sum+=arr[i];
            if(hs.contains(sum-0)){
                count++;
            }

            hs.add(sum);
        }
        return count;
    }
    static int sbwithKsum(int k, int[] arr){

        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<>();

        ar.size();
        hm.put(0,1);
        int result = 0;
        int sum = 0;
        for(int i = 0; i < arr.length ; i++){
            sum+= arr[i];
            if(hm.containsKey(sum - k)){
                result+= hm.get(sum-k);
            }
            hm.put(sum, hm.getOrDefault(sum,0)+1);
        }
        return result;
    }
    static int sbWithZeroSum1(int[] arr,int k){
        int preSum = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            preSum+= arr[i];
            if( preSum == k){
                result = i+1;
            }
            if (!hm.containsKey(preSum)){
                hm.put(preSum,i);
            }
            if(hm.containsKey(preSum-k)){
                result = Math.max(result,i-hm.get(preSum-k));
            }

        }
        return result;
    }
    static int  lswzo(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int z=0,o=0;
        int result = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 0){
                hm.put(arr[i],z+1);
            }
            else {
                hm.put(arr[i],o+1);
            }
            if (hm.get(0) == hm.get(1)){
                result = Math.max(result,hm.get(0));
            }
        }
        return  result;
    }
}
