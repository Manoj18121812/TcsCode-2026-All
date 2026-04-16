package IfElse;

import java.util.*;
public class OnlineOrder {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int amount=sc.nextInt();
        String cop=sc.next();

        double finalprice;

        if(amount>=3000 && cop.equals("yes")){
            finalprice = amount-(amount*0.4);
        }else if(amount>=3000){
            finalprice= amount-(amount*0.2);
        }else{
            finalprice= amount-(amount*0.05);
        }
        System.out.println(Math.round(finalprice));
        System.out.println((int)finalprice);
    }
}
