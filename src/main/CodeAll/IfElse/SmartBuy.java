package IfElse;

import java.util.*;
public class SmartBuy {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        int amount= sc.nextInt();
        System.out.println("Enter type");
        String type= sc.next();

        double discount;

        if(amount>=5000){
            if(type.equals("Gold")){
                discount= amount-(amount*0.30);
            }else if(type.equals("Silver")){
                discount=amount-(amount*0.20);
            }else{
                discount= amount-(amount*0.10);
            }

        }else{
            discount= amount-(amount*0.05);
        }
        System.out.println(Math.round(discount));
        System.out.println((int)discount);
    }
}
