package LeetcodeArray;
import java.util.*;
public class NumberWithEvenDigit {
    public static void main(String []args){
        int nums[]={12,345,2,6,7896};

       /* int count=0;
        for(int num:nums){
            if(String.valueOf(num).length()%2==0){
                count++;
            }
        }
        System.out.print(count);*/


        int count=0;
        for(int num:nums){
            int digits=0;

            while(num>0){
                num=num/10;
                digits++;
            }
            if(digits%2==0){
                count++;
            }
        }
        System.out.print(count);
    }
}
