import java.util.*;
public class FestivalOffer {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter amount");
    int amount= sc.nextInt();
    System.out.println("Enter fest");
    String fest= sc.next();

    double discount;

    if(amount>=3000 && fest.equals("Yes")){
        discount = amount-(amount*0.30);
    }else if(amount>=3000){
        discount= amount-(amount*0.30);
    }else{
        discount = amount-(amount*0.05);
    }
    System.out.println((int)discount);
    System.out.println(Math.round(discount));
}
}
