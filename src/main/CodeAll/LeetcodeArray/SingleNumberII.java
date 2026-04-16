package LeetcodeArray;
import java.util.*;
public class SingleNumberII {
    public static void main(String[]args){

        int arr[]={0,1,0,1,0,1,99};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:map.keySet()){
            if(map.get(num)==1){
                System.out.println(num);
                return ;
            }
        }
    }
}
