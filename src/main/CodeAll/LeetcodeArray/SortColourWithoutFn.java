package LeetcodeArray;
import java.util.*;
public class SortColourWithoutFn {

    public static void main(String[] args){
    int arr[]={2,0,2,1,0,1};

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1;j++){
           if(arr[j]>arr[j+1]){
               int temp= arr[j+1];
               arr[j+1]=arr[j];
               arr[j]=temp;
           }

        }
    }
    for(int num:arr){
        System.out.print(num+" ");
    }
}
}
