package LeetcodeArray;
import java.util.*;
public class FindPivotIndex {
    public static void main(String[]args){
        int arr[]={1,7,3,6,5,6};

        int totalSum= 0;
        for(int num:arr){
            totalSum= totalSum+num;
        }

        int leftSum=0;

        for(int i=0;i<arr.length;i++){
            int rightSum= totalSum-leftSum-arr[i];

            if(rightSum==leftSum){
                System.out.print(i);
                return;
            }
            leftSum= leftSum+arr[i];
        }
        System.out.print(-1);
    }
}
