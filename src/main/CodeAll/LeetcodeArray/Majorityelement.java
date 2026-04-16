package LeetcodeArray;
import java.util.*;
public class Majorityelement {

    public static void main(String []args){

        int arr[]= {3,2,3};

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:arr){
            if(map.get(num)>arr.length/2){
                System.out.println(num);
                return;
            }
        }
    }
}
