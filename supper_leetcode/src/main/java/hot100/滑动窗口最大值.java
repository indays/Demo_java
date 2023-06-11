package hot100;

import java.util.*;

public class 滑动窗口最大值 {

    public static void main(String[] args) {


    }


    public void solution(int [] nums,int k){


        Queue<int []> primaryQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int [] o1, int [] o2) {
                return o2[0]!=o1[0]?o2[0]-o1[0]:o2[1]-o1[1];
            }
        });


        int [] res =new int[]{};

        for (int i = 0; i < k; ++i) {

            primaryQueue.offer(new int[]{nums[i],i});

        }


        res[0]=primaryQueue.peek()[0];

        for(int j=k;j<nums.length;j++){

            primaryQueue.offer(new int[]{nums[j], j});

            while (primaryQueue.peek()[1]<nums.length-k){
                primaryQueue.poll();
            }

            res[j - k + 1] = primaryQueue.peek()[0];

        }




    }
}
