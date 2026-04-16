package LeetcodeArray;
import java.util.*;
public class PairsSongDivisible {
    public static void main(String[]args){

        int arr[]={30,20,150,100,40};
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])%60==0){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
