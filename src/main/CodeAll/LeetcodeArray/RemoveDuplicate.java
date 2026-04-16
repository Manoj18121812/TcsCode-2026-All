package LeetcodeArray;
import java.util.*;
public class RemoveDuplicate {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String value= sc.nextLine();

        String arr[]=value.split(" ");

        int arr1[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr1[i]= Integer.parseInt(arr[i]);
        }

        List<Integer>list = new ArrayList<>();

        for(int num:arr1){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        System.out.println(list.size());

        for(int num:list){
            System.out.print(num+" ");
        }
    }
}
