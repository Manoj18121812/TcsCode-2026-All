package LeetcodeArray;
import java.util.*;
public class HeightChecker {
    public static void main(String[]args){
        int arr[]={1,1,4,2,1,3};
        int arr1[]=arr.clone();
        Arrays.sort(arr1);

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr1[i]){
                count++;
            }
        }
        System.out.print(count);
    }
}
