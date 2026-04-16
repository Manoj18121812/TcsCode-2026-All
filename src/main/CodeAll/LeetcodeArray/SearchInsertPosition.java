package LeetcodeArray;
import java.util.*;
public class SearchInsertPosition {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[]={1,3,5,6};
        int target=5;
        int index=arr.length;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                index=i;
                System.out.println(index);

                return;
            }
        }
        System.out.println(index);
    }
}
