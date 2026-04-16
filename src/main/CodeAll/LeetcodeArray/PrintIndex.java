package LeetcodeArray;
import java.util.*;
public class PrintIndex {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String first=sc.next();
        String second=sc.next();

        int n=first.length();
        int m = second.length();
        //first way
        System.out.println(first.indexOf(second));

        //second way
        for(int i=0;i<=n-m;i++){
            if(first.substring(i,i+m).equals(second)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

    }
}
