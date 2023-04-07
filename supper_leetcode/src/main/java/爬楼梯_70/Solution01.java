package 爬楼梯_70;

public class Solution01 {

    public int climbStairs(int n) {

        if(n<=3){
            return n;
        }

        return climbStairs(n-1)+climbStairs(n-2);
    }
}
