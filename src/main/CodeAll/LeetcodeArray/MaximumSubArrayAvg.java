package LeetcodeArray;
import java.util.*;
public class MaximumSubArrayAvg {
    public static void main(String [] args){
        int arr[]={1,12,-5,-6,50,3};
        int k=4;

        int sum =0;
        for(int i=0;i<k;i++){
            sum= sum+arr[i];
        }
        int maxsum=sum;

        for(int i=k;i<arr.length;i++){
            sum = sum +arr[i]-arr[i-k];
            maxsum = Math.max(sum,maxsum);
        }
        System.out.print((double)maxsum/k);
    }
}
