import java.util.*;
public class BankLoan {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        int score= sc.nextInt();
        String loan = sc.next();

        if(salary>=40000){
            if(score>=750){
                if(loan.equals("no")){
                    System.out.println("Approved");
                }else{
                    System.out.println("Conditional");
                }
            }else{
                System.out.println("Rejected");
            }
        }else{
            if(score>=800){
                System.out.println("Conditional");
            }else{
                System.out.println("Rejected");
            }
        }

    }
}
