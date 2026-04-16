package LeetcodeArray;
import java.util.*;
public class NumberSmallerThanCurrent {
    public static void main(String[] args){

        int arr[]={8,1,2,2,3};
        int result[]= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    count++;
                }
            }
            result[i]=count;
        }
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
