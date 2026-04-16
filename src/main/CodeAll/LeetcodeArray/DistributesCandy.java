package LeetcodeArray;
import java.util.*;
public class DistributesCandy {
    public static void main(String[] args){
        Set<Integer>set = new HashSet<>();
        int arr[]= {1,1,2,2,3,3};
        for(int num:arr){
            set.add(num);
        }

        System.out.print(Math.min(set.size(),arr.length/2));
    }
}
