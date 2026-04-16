package LeetcodeArray;
import java.util.*;
public class ArrayAndItsDouble {
    public static void main(String []args){

        int arr[]={10,2,5,3};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]*2){
                    System.out.print("True");
                    return;
                }
            }
        }
        System.out.print("False");
    }
}
