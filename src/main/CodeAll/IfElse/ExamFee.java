package IfElse;

import java.util.*;
public class ExamFee {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks");
        int marks=sc.nextInt();
        System.out.println("enter fee");
        int fee = sc.nextInt();

        double finalfee;

        if(marks>=90){
            finalfee = fee-(fee*0.5);
        }else if(marks>=75){
            finalfee = fee-(fee*0.3);
        }else if(marks>=50){
            finalfee= fee-(fee*0.10);
        }else{
            finalfee= fee;
        }

        System.out.println(Math.round(finalfee));
        System.out.println((int)finalfee);
    }
}
