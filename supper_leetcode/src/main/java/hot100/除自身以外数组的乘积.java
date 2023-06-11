package hot100;

public class 除自身以外数组的乘积 {

    public static void main(String[] args) {

        productExceptSelf(new int[]{1, 2, 3, 4});
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] reNums = new int[nums.length];

        int[] l =new int[nums.length];

        int[] r =new int[nums.length];

        l[0]=1;
        r[nums.length-1]=1;

        for (int i = 1; i < nums.length; i++) {
            l[i]=nums[i-1]*l[i-1];
        }

        for (int j = nums.length - 2; j >= 0; j--) {
            r[j] = nums[j + 1] * r[j + 1];
        }


        for(int i=0;i<nums.length;i++){
            reNums[i]=l[i]*r[i];
        }



        // 单例

        // 多例

        return reNums;

    }
}
