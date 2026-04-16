package LeetcodeArray;
import java.util.*;
public class MaxChunksMakesSorted {

    public static void main(String[]args){
        int max=0;
        int arr[]={4,3,2,1,0};
        int chunks=0;

        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            if(max==i){
                chunks++;
            }
        }
        System.out.print(chunks);
    }
}
