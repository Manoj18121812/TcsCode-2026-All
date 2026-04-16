package LeetcodeArray;
import java.util.*;
public class BestTimeBuyStockII {
    public static void main(String[]args){
        int arr[]= {7,1,5,3,6,4};

        int maxProfit=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                maxProfit=arr[i]-arr[i-1]+maxProfit;
            }
        }
        System.out.println(maxProfit);
    }
}
