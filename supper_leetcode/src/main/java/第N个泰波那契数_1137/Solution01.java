package 第N个泰波那契数_1137;

public class Solution01 {

    public int tribonacci(int n) {

        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }

        int r=0;
        int p=1;
        int q=1;
        int i=3;
        int temp=0;
        while(i<=n){

            temp=r+p+q;
            r=p;
            p=q;
            q=temp;
            i++;

        }
        return temp;
    }
}
