package LeetcodeArray;
import java.util.*;
public class PartitionThreeParts {

    public static void main(String[] args){

        int arr[]= {0,2,1,-6,6,-7,9,1,2,0,1};

        int total =0;
        for(int num:arr){
            total=total+num;
        }
        if(total%3!=0){
            System.out.print("False");
            return;
        }
        int count=0;
        int target=total/3;
        int sum=0;

        for(int num:arr){
            sum = sum+num;
            if(sum==target){
                count++;
                sum=0;
            }

        }
        System.out.print(count>=3);
    }
}
