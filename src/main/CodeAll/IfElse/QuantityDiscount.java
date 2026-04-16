package IfElse;

import java.util.*;
public class QuantityDiscount {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter qty");
        int qty= sc.nextInt();
        System.out.println("enter price");
        int price = sc.nextInt();

        int total = qty*price;
        double finalprice;
        if(qty>=100){
            finalprice= total -(total*0.20);
        }else if(qty>=50){
            finalprice= total-(total*0.10);
        }else{
            finalprice = total;
        }
        System.out.println((int)finalprice);
        System.out.println(Math.round(finalprice));
    }
}
