package LeetcodeArray;
import java.util.*;
public class SortArrayByParityII {
    public static void main(String[]args){
        int arr[]={4,2,5,7};
        int result[]= new int[arr.length];

        int even=0;
        int odd=1;

        for(int num:arr){

            if(num%2==0){
                result[even]=num;
                even=even+2;
            }else{
                result[odd]=num;
                odd=odd+2;
            }
        }
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
