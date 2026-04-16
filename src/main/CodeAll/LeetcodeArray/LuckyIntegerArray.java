package LeetcodeArray;
import java.util.*;
public class LuckyIntegerArray {

    public static void main(String[]arrgs){
        int nums[]={2,2,3,4};

        HashMap<Integer,Integer>map= new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int result=-1;

        for(int key:map.keySet()){
            if(key==map.get(key)){
                result= Math.max(result,key);
            }
        }
        System.out.print(result);
    }
}
