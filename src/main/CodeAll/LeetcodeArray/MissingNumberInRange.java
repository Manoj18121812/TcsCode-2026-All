package LeetcodeArray;
import java.util.*;
public class MissingNumberInRange {

    public static void main(String[]args){
        int arr[]={0,2,3};
        int n = arr.length;

        Set<Integer>set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }

        for(int i=0;i<=n;i++){
            if(!set.contains(i)){
                System.out.print(i);
                return;
            }
        }

    }
}
