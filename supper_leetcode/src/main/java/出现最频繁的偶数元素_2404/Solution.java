package 出现最频繁的偶数元素_2404;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {


    public static void main(String[] args) {
        mostFrequentEven(new int[]{0, 1, 2, 2, 4, 4, 1});
    }

    private static int mostFrequentEven(int[] nums) {

        if(nums.length==0){ return -1;}



        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (i % 2 != 0) {
                continue;
            }
            Integer values = map.get(i) == null ? 0 : map.get(i);

            values++;

            map.put(i, values);

        }

        int max=0;
        int returnI=-1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if(entry.getValue()>max){
                max = entry.getValue();
                returnI = entry.getKey();
            } else if (entry.getValue() == max && entry.getKey() < returnI) {
                returnI = entry.getKey();

            }
        }


        return returnI;
    }

}
