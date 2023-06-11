package hot100;

import java.util.Arrays;
import java.util.HashSet;

public class DOMOE {

    public static int longestConsecutive(int[] nums) {

        HashSet set =new HashSet(Arrays.asList(nums));




        int max =0;
        for(int i:nums){

            if(set.contains(i-1)){
                continue;
            }

            int z=i;
            int singleMax =0;
            while(set.contains(z)){

                z++;
                singleMax++;
            }

            max=Math.max(singleMax,max);
        }
        return max;
    }

    public static void main(String[] args) {


        for(int i=0;i<1;i++){


        }
    }
}
