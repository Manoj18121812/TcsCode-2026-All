package LeetcodeArray;
import java.util.*;
public class BestTimeBuySellStock {
        public static void main(String[]args){
            int arr[]={7,1,5,3,6,4};

            int min = Integer.MAX_VALUE;
            int maxProfit=0;

            for(int price:arr){
                if(price<min){
                    min=price;
                }else{
                    maxProfit= Math.max(maxProfit,price-min);
                }
            }
            System.out.print(maxProfit);
        }
}
