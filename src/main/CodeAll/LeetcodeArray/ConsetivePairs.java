package LeetcodeArray;
import java.util.*;
public class ConsetivePairs {
    public static void main(String[]args){

        int arr[]={0,1,2,4,5,7};
        List<String>list =  new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int start= arr[i];

            while(i<arr.length-1 && arr[i]+1==arr[i+1]){
                i++;
            }
            if(start ==arr[i]){
                System.out.print(start+" ");
                list.add(String.valueOf(start));
            }else{
                System.out.print(start+ "->"+arr[i]+" ");
                list.add(String.valueOf(start+ "->"+arr[i]+" "));
            }
        }
        System.out.println("");
        for(String ch:list){
            System.out.print(ch);
        }
    }
}
