package LeetcodeArray;
import java.util.*;
public class ThirdMaximumNumber {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};

        Set<Integer> set= new HashSet<>();

        for(int num:arr){
            set.add(num);
        }
        if(set.size()<3){
            System.out.print(Collections.max(set));
            return;
        }
        set.remove(Collections.max(set));
        set.remove(Collections.max(set));

        System.out.print(Collections.max(set));
    }
}
