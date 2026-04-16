package IfElse;

import java.util.*;
public class AmountDiscount {

    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        String manoj=sc.nextLine();
        int amount = Integer.parseInt(manoj);

        double discount;

        if(amount>=5000){
            discount = amount-(amount*0.20);
        }else if(amount>=2000){
            discount = amount-(amount*0.15);
        }else{
            discount=amount;
        }

        System.out.println((int)discount);
        System.out.println(Math.round(discount));
    }
}
