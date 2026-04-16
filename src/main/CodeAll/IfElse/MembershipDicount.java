package IfElse;

import java.util.*;
public class MembershipDicount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter type");
        String type = sc.next();
        System.out.println("Enter Amount");
        int amount = sc.nextInt();

        double finalAmount;

        if (type.equals("Premium")) {
            finalAmount = amount - (amount * 0.25);
        } else if (type.equals("Gold")) {
            finalAmount = amount - (amount * 0.15);
        } else {
            finalAmount = amount - (amount * 0.05);
        }

        System.out.println(Math.round(finalAmount));
        System.out.println((int)finalAmount);
    }
}
