package hot100;

public class 最大子数组和 {

    public Integer solution(int[] nums) {
        int max =0;
        int sum =0;
        for(int i=0;i<nums.length;++i){
            if(sum>0){
                sum+=nums[i];
            }else{
                sum=nums[i];
            }


            max = Math.max(max, sum);
        }

        return max;

    }


}
