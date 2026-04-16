package LeetcodeArray;
import java.util.*;
public class FirstPositiveMissing {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String arr[]= value.split(" ");

        int arr1[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=Integer.parseInt(arr[i]);
        }

        Set<Integer> set = new HashSet<>();

        for(int num :arr1){
            set.add(num);
        }
        int missing=1;
        while(true){
            if(!set.contains(missing)){
                System.out.println(missing);
                return;
            }else{
                missing++;
            }
        }

    }
}
