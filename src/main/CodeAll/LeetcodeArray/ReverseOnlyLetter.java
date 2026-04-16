package LeetcodeArray;
import java.util.*;
public class ReverseOnlyLetter {
    public static void main(String []args){

        String word="ab-cd";

        Stack<Character>stack= new Stack<>();

        for(char ch:word.toCharArray()){
            if(Character.isLetter(ch)){
                stack.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(char ch:word.toCharArray()){
            if(Character.isLetter(ch)){
               sb.append(stack.pop());
            }else{
                sb.append(ch);
            }
        }
        System.out.print(sb.toString());
    }
}
