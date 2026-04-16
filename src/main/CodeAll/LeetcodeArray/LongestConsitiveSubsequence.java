package LeetcodeArray;
import java.util.*;
public class LongestConsitiveSubsequence {
    public static void main(String[]args){
        int arr[]={1,3,5,4,7};

        int maxLength=1;
        int currentLength=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                currentLength++;
            }else{
                currentLength=1;
            }
            maxLength=Math.max(maxLength,currentLength);
        }
        System.out.print(maxLength);
    }
}
