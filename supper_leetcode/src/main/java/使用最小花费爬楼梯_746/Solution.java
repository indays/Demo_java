package 使用最小花费爬楼梯_746;

public class Solution {


    public int minCostClimbingStairs(int[] cost) {

        int lenth =cost.length;

        int p=cost[0];
        int q=cost[1];

        if(lenth<=2){
            return p>q?q:p;
        }

        int index=2;
        while(index<lenth){

            int temp=p>q?q:p;

            p=q;
            q=temp+cost[index];

            index++;

        }

        return p>q?q:p;

    }
}
