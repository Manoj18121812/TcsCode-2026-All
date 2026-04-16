package LeetcodeArray;
import java.util.*;
public class IntersectionOfArray {

    public static void main(String [] args){
        int arr[]={1,2,2,1};
        int arr1[]={2,2};

        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for(int num:arr){
            set.add(num);
        }

        for(int num:arr1){
            if(set.contains(num)){
                set1.add(num);
            }
        }
        for(int num:set1){
            System.out.print(num+" ");
        }
    }
}
