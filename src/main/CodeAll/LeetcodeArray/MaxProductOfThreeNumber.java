package LeetcodeArray;
import java.util.*;
public class MaxProductOfThreeNumber {
    public static void main(String [] args){
        int arr[]= {1,2,3};
        int n= arr.length;
        int first= arr[n-1]*arr[n-2]*arr[n-3];
        int second= arr[0]*arr[1]*arr[n-1];

        int result = Math.max(first,second);

        System.out.print(result);
    }
}
