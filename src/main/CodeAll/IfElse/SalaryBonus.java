package IfElse;

import java.util.*;
public class SalaryBonus {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int salary= sc.nextInt();
        int experiance=sc.nextInt();
        int rating=sc.nextInt();

        double finalprice;

        if(salary>=50000){
            if(experiance>=5){
                if(rating>=4){
                    finalprice= salary-(salary*0.30);
                }else{
                    finalprice= salary-(salary*0.20);
                }
            }else{
                finalprice=salary-(salary*0.10);
            }
        }else {
            if(rating>=4){
                finalprice=salary-(salary*0.15);
            }else{
                finalprice= salary-(salary*0.05);
            }
        }
        System.out.println(Math.round(finalprice));
        System.out.println((int)finalprice);
    }
}
