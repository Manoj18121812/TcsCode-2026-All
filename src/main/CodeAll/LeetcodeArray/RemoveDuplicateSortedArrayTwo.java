package LeetcodeArray;
import java.util.*;
public class RemoveDuplicateSortedArrayTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String arr[] = value.split(" ");

        int arr1[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i]= Integer.parseInt(arr[i]);
        }

        if(arr1.length <= 2) {
            System.out.println(arr1.length);
            for(int num : arr1){
                System.out.print(num + " ");
            }
            return;
        }

        int k=2;

        for(int i=2;i<arr1.length;i++){
            if(arr1[i]!=arr1[k-2]){
                arr1[k]=arr1[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}