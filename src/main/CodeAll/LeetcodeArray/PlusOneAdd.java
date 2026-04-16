package LeetcodeArray;
import java.util.*;
public class PlusOneAdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String value= sc.nextLine();
        String arr[]= value.split(" ");

        int arr1[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr1[i]=Integer.parseInt(arr[i]);
        }

        int n= arr1.length;

        for(int i=n-1;i>=0;i--){
            if(arr1[i]<9){
                arr1[i]++;

                for(int num: arr1){
                    System.out.print(num+" ");
                }
                return;
            }
            arr1[i]=0;
        }
        int result[]= new int[n+1];
        result[0]=1;

        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
