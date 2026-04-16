package LeetcodeArray;
import java.util.*;
public class DuplicateZero {
    public static void main(String []args){

        int arr[]= {1,0,2,3,0,4,5,0};
        List<Integer>list = new ArrayList<>();

        for(int num:arr){
            if(num==0){
                list.add(0);
                list.add(0);
            }else{
                list.add(num);
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(list.get(i)+" ");
        }

        //or copy back karna array me ab fir array print krna
    }
}
