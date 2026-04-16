package LeetcodeArray;
import java.util.*;
public class MonotonicArray {

    public static void main(String[] args){

        int arr[]= {1,2,2,3};

        boolean incre=true;
        boolean decre=true;

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]<arr[i+1]){
                decre=false;
            }
            if(arr[i]>arr[i+1]){
                incre= false;
            }
        }
        boolean result = incre || decre;

        System.out.print(result);
    }
}
