package LeetcodeArray;
import java.util.*;

public class IntersectionOfArrayII {

    public static void main(String[]args){
        int arr[]={1,2,2,1};
        int arr1[]={2,2};

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> list = new ArrayList<>();

        for(int num:arr1){
            if(map.containsKey(num) && map.get(num)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }

        int result[]= new int[list.size()];

        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
