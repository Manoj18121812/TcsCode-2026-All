package LeetcodeArray;
import java.util.*;
public class MoveZeroToEndII {
    public static void main(String[]args){
        int arr[]= {1,0,0,3,10,5,2};

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
