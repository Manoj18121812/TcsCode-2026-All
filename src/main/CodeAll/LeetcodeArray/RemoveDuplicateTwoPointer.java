package LeetcodeArray;
import java.util.*;
public class RemoveDuplicateTwoPointer {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String value= sc.nextLine();

        String arr[]=value.split(" ");

        int arr1[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr1[i]= Integer.parseInt(arr[i]);
        }


        int k=0;
        for(int j=1;j<arr1.length;j++){
            if(arr1[j]!=arr1[k]){
                k++;
                arr1[k]=arr1[j];
            }
        }
int m=k+1;
        System.out.println(m);

        for(int l=0;l<m;l++){
            System.out.print(arr1[l]+" ");
        }
    }
}
