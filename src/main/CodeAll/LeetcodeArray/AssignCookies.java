package LeetcodeArray;
import java.util.*;
public class AssignCookies {
    public static void main(String[]args){
        int arr[]= {1,2,3};
        int arr2[]={1,1};

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int i=0;
        int j=0;
        while(i<arr.length&& j<arr2.length){
        if(arr2[j]>=arr[i]){
            i++;
        }
        j++;
        }
        System.out.print(i);
    }
}
