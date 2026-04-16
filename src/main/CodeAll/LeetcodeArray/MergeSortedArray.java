package LeetcodeArray;
import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args){

        int arr[]={2,3,6};
        int arr1[]={1,4,5};

        int arr3[]= new int[arr.length+arr1.length];

        int i=0;
        for(int num:arr){
            arr3[i]=num;
            i++;
        }

        for(int num:arr1){
            arr3[i]=num;
            i++;
        }
        Arrays.sort(arr3);

        for(int num:arr3){
            System.out.print(num+" ");
        }
    }
}
