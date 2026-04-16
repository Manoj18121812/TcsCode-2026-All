package LeetcodeArray;
import java.util.*;
public class MinimumAbsoluteDiff {
    public static void main(String[]args){
        int[] arr = {4, 2, 1, 3};

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        // Step 1: find minimum difference
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            minDiff = Math.min(minDiff, diff);
        }

        // Step 2: collect pairs
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff == minDiff) {
                System.out.println(arr[i - 1] + " " + arr[i]);
            }
        }
    }
}
