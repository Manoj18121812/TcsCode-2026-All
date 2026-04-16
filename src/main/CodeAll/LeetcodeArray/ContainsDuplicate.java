package LeetcodeArray;
import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args){
        Set<Integer>set = new HashSet<>();
        int arr[]= {1,2,3,4};
        for(int num:arr){
            if(!set.add(num)){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
