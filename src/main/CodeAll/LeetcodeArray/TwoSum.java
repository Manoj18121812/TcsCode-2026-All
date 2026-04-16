package LeetcodeArray;

import java.util.*;
public class TwoSum {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String array= sc.nextLine();
        int target= sc.nextInt();
        String arr[]= array.split(" ");

        int arr1[]= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr1[i]=Integer.parseInt(arr[i]);
        }

        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]+arr1[j]==target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }



    }
}
