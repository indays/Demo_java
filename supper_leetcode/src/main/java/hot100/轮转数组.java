package hot100;

public class 轮转数组 {


    public void rotate(int[] nums, int k) {

        int size = nums.length;

        int[] rotateNums = new int[size];

        for (int i = 0; i < size; i++) {

            int rotateIndex =i+k>size-1?(i+k)%size:i + k;

            rotateNums[rotateIndex]=nums[i];

        }

        for (int i = 0; i < size; i++) {

            nums[i]=rotateNums[i];
        }


    }




}
