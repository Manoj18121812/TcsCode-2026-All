package LeetcodeArray;
import java.util.*;
public class RemoveElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();
        String arr[] = value.split(" ");
        int target=sc.nextInt();

        int arr1[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }

        int k=0;

        for(int j=0;j<arr1.length;j++){
            if(arr1[j]!=target){
                arr1[k]=arr1[j];
                k++;
            }
        }
        for(int z=0;z<k;z++){
            System.out.print(arr1[z]+" ");
        }
    }
}
