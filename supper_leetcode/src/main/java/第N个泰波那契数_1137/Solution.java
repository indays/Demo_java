package 第N个泰波那契数_1137;

/**
 *  泰波那契序列 Tn 定义如下： 
 *
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2

 */
public class Solution {

    public int tribonacci(int n) {

        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }

        return tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1);
    }
}
