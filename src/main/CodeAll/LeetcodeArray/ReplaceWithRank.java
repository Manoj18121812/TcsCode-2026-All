package LeetcodeArray;
import java.util.*;
public class ReplaceWithRank {
    public static void main(String[] args){

        int arr[]= {40, 10, 20, 30};

        int arr1[]= arr.clone();
        Arrays.sort(arr1);

        HashMap<Integer,Integer>map = new HashMap<>();

        int key=1;

        for(int num:arr1){
            if(!map.containsKey(num)){
                map.put(num,key++);
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }

        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}
