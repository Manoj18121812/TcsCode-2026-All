package LeetcodeArray;
import java.util.*;
public class DisapperedElement {
    public static void main(String[] args){
        int arr[]={4,3,2,7,8,2,3,1};

        Set<Integer>set= new HashSet<>();
        List<Integer>list = new ArrayList<>();

        for(int num:arr){
            set.add(num);
        }

        for(int i=1;i<=arr.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        for(int num:list){
            System.out.print(num+" ");
        }

    }
}
