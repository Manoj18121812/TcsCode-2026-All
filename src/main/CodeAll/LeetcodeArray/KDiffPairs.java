package LeetcodeArray;
import java.util.*;
public class KDiffPairs {

    public static void main(String[]args){
        int arr[]={3,1,4,1,5};
        int k=2;
        Set<Integer>set = new HashSet<>();


        for(int num:arr){
            set.add(num);
        }

        int count=0;

        for(int num:set){
            if(set.contains(num+k)){
                count++;
            }
        }
System.out.print(count);
    }
}
