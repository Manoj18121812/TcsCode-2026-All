package LeetcodeArray;
import java.util.*;
public class SortByParityEvenOdd {
    public static void main(String[] args){

        int arr[]={3,1,2,4};
        int n= arr.length;
        int result[]= new int[n];
        int index=0;

        for(int num:arr){
            if(num%2==0) {
                result[index++] = num;
            }
        }
        for(int num:arr){
            if(num%2==1){
                result[index++]=num;
            }
        }
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
