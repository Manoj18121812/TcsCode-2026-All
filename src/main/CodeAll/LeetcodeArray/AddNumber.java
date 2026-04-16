package LeetcodeArray;
import java.util.*;
public class AddNumber {
    public static void main(String[]args){
        int arr[]={2,7,4};
        int k=181;

        LinkedList<Integer>list= new LinkedList<>();

        int i=arr.length-1;

        while(i>=0 || k>0){
            if(i>=0){
                k= k+arr[i];
                i--;
            }
            list.addFirst(k%10);
            k=k/10;
        }
        System.out.print(list);
    }
}
