package LeetcodeArray;
import java.util.*;
public class ArrayPartitionSum {
    public static void main(String[]args){
        int arr[]= {1,4,3,2};
        Arrays.sort(arr);

        int sum=0;
        for(int i=0;i<arr.length;i=i+2) {
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}
