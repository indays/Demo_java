package hot100;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 缺失的第一个正数 {

    public static void main(String[] args) {
        test01(new int[]{1,2,0});
    }


    public static int test01(int [] nums){

        int min =nums[0];
        int max=nums[0];
        Set<Integer> set = new HashSet();

        for(int num:nums){

            if(min>num){
                min=num;
            }

            if(max<num){

                max=num;
            }

            if(!set.contains(num)){
                set.add(num);
            }

        }

        while(min<=max){

            if(set.contains(min)){
                min++;
            }else{
                return min;
            }
        }

        return min;





    }
}
