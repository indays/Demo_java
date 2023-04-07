package 爬楼梯_70;

public class Solution {


    public int climbStairs(int n) {

        if(n<=3){
            return n;
        }

        int p=2,q=3;

        int index=4;
        int temp =0;
        while(index<n){

            temp=p+q;
            p=q;
            q=temp;
            index++;
        }

        return temp;
    }

}
