package LeetcodeArray;
import java.util.*;
public class TargetArray {
public static void main(String[]args){
    int nums[]={0,1,2,3,4};
    int index[]={0,1,2,2,1};

    List<Integer>list= new ArrayList<>();

    for(int i=0;i<nums.length;i++){
        list.add(index[i],nums[i]);
    }

    int result[]= new int[list.size()];

    for(int j=0;j<nums.length;j++){
        result[j]=list.get(j);
    }

    for(int num:result){
        System.out.print(num+" ");
    }
}
}
