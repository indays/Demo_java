package 打家劫舍_198;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {

    // n<=2 则 只可投一家
    // 第n家 可投金额为 a[n-1] a[n-2]  a[n-3]  a[n-4]  a[n-5]  a[n-6]  ... 最大值

    // 递归写法  [1,2,3,4]
    // n<=2    max=a[0] >a[1] ? a[0]:a[1]
    // n>3
     // N =F(N-1),F(N-2)i
    public int rob(int[] nums) {

        int lenth = nums.length;

        int r=0;
        int l=0;

        for (int i : nums) {

            int temp=Math.max(l,r+i);
            r=l;
            l=temp;
        }

        return l;
    }

}
