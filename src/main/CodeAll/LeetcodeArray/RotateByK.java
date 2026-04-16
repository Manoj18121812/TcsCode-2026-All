package LeetcodeArray;
import java.util.*;
public class RotateByK {
    public static void main(String[]args){

        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int k=3;
        k=k%n;
        int result[]= new int[n];

        for(int i=0;i<n;i++){
        result[(i+k)%n]=arr[i];
        }

        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
