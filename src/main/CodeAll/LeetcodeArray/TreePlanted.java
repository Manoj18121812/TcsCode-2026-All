package LeetcodeArray;
import java.util.*;
public class TreePlanted {
    public static void main(String[]args){

        int arr[]={1,0,0,0,1};

        int n=1;

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                if((i==0 || arr[i-1]==0) &&  (i==arr.length-1 || arr[i+1]==0) ){
                    arr[i]=1;
                    count++;
                }
            }
        }
        System.out.print(count>=n);
    }
}
