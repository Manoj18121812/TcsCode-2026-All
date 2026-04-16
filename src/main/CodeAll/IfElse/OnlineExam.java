package IfElse;

import java.util.*;
public class OnlineExam {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int marks= sc.nextInt();
        int attendence=sc.nextInt();

        if(attendence>=75) {
            if(marks>=90){
                System.out.println("A");
            }else if(marks>=70){
                System.out.println("B");
            }else if(marks>=50){
                System.out.println("C");
            }else{
                System.out.println("Fail");
            }
        }else{
            if(marks>=90){
                System.out.println("B");
            }else{
                System.out.println("Fail");
            }
        }
    }
}
