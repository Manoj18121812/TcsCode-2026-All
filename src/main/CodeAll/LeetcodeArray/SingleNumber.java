package LeetcodeArray;
import java.util.*;
public class SingleNumber {
    public static void main(String[]args){
        int arr[]={1,1,2,2,3};

        int result=0;

        for(int num:arr){
            result = result^num;
        }
        System.out.println(result);
    }
}
