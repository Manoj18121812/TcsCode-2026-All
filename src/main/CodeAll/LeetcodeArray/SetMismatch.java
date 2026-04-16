package LeetcodeArray;
import java.util.*;
public class SetMismatch {
    public static void main(String[]args){

        int arr[]= {1,2,2,3};
        int n= arr.length;
        int freq[]= new int[n+1];

        for(int num:arr){
            freq[num]++;
        }

        int duplicate=-1;
        int missing=-1;

        for(int i=1;i<=n;i++){
            if(freq[i]==2){
                duplicate=i;
            }
            if(freq[i]==0){
                missing=i;
            }

        }
        System.out.print("["+duplicate+","+missing+"]");
    }
}
