package LeetcodeArray;
import java.util.*;
public class NonDecreasingArray {
    public static void main(String[] args){
        int arr[]={4,2,3};

        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        System.out.print(count);
    }
}
